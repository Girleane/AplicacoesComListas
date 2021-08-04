package Circular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return tamanhoLista == 0;
    }

    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Lista Vazia");

        if (index == 0)
            return this.cauda;

        No<T> noAux = this.cauda;

        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getProximoNo();
        }

        return noAux;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void remove(int index) {
        if (index >= tamanhoLista)
            throw new IndexOutOfBoundsException("O indice eh maior q o tamanho da lista");

        No<T> noAux = this.cauda;

        if (index == 0) {
            this.cauda = cauda.getProximoNo();
            this.cabeca.getProximoNo().setProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAux = noAux.getProximoNo();
            }

            noAux.setProximoNo(noAux.getProximoNo().getProximoNo());

        }

        this.tamanhoLista--;
    }

    public void add(T elemento) {
        No<T> novoNo = new No<>(elemento);

        if (this.tamanhoLista == 0) {
            this.cauda = novoNo;
            this.cabeca = this.cauda;
            this.cabeca.setProximoNo(this.cauda);
        } else {
            novoNo.setProximoNo(this.cauda);
            this.cauda = novoNo;
            this.cabeca.setProximoNo(this.cauda);
        }

        this.tamanhoLista++;
    }


    public String toString() {
        String str = "";
        No<T> noAux = this.cauda;

        for (int i = 0; i < size(); i++) {

            str += "No{ conteudo = " + noAux.getConteudo() + " } ---->";

            noAux = noAux.getProximoNo();
        }

        if (isEmpty()) {
            str += "null";
        } else {
            str += "(retorna ao inicio)";
        }

        return str;
    }
}
