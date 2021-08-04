package DuplaEncadeada;

public class ListaDuplaEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplaEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAux = primeiroNo;

        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getNoPos();
        }

        return noAux;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        novoNo.setNoPos(null);
        novoNo.setNoAnt(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }

        if (ultimoNo != null) {
            ultimoNo.setNoPos(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add( T elemento, int index) {

        NoDuplo<T> noAux = this.getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        novoNo.setNoPos(noAux);

        if (novoNo.getNoPos() != null) {
            novoNo.setNoAnt(noAux.getNoAnt());
            novoNo.getNoPos().setNoAnt(novoNo);
        } else {
            novoNo.setNoPos(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnt().setNoPos(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoPos();

            if (primeiroNo != null) {
                primeiroNo.setNoAnt(null);
            }
        }

        NoDuplo<T> noAux = this.getNo(index);
        noAux.getNoAnt().setNoPos(noAux.getNoPos());
        if (noAux != ultimoNo) {
            noAux.getNoPos().setNoAnt(noAux.getNoAnt());
        } else {
            ultimoNo = noAux;
        }

        tamanhoLista--;
    }

    public String toString() {
        String str = "";

        NoDuplo<T> noAux = primeiroNo;

        for (int i = 0; i < this.size(); i++) {
            str += "No{ conteudo = " + noAux.getConteudo() + "}--> ";
            noAux = noAux.getNoPos();
        }

        str += "NULL";

        return str;
    }
}
