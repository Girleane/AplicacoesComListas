package Encadeadas;

public class ListaEncadeada<T> {

    No<T> refIn;

    public ListaEncadeada() {
        this.refIn = null;
    }

    public boolean isEmpty() {
        return refIn == null;
    }

    private No<T> getNo(int index) {
        validaIndex(index);

        No<T> noAux = refIn;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }

        return noRetorno;
    }

    private void validaIndex(int index) {
        if (index >= size()) {
            int tamanho = size() - 1;
            throw new IndexOutOfBoundsException("Indice maior que o tamanho da lista. Tamanho da lista = " + tamanho + '.');
        }
    }

    public int size() {
        int tamanhoLista = 0;

        No<T> noAux = refIn;

        while (true) {
            if (noAux != null) {
                tamanhoLista++;
                if (noAux.getProximoNo() != null) {
                    noAux = noAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            refIn = novoNo;
            return;
        }

        No<T> noAux = refIn;

        for (int i = 0; i < this.size() - 1; i++) {
            noAux = noAux.getProximoNo();
        }

        noAux.setProximoNo(novoNo);
    }

    public T remove(int index) {
        if (!isEmpty()) {
            No<T> noRemove = this.getNo(index);

            if (index == 0) {
                refIn = noRemove.getProximoNo();
                return noRemove.getConteudo();
            }

            No<T> noAnteriorRem = this.getNo(index - 1);
            noAnteriorRem.setProximoNo(noRemove.getProximoNo());
            return noRemove.getConteudo();
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "";

        No<T> noAux = refIn;

        for (int i = 0; i < this.size(); i++) {
            str += "No{" + " conteudo = " + noAux.getConteudo() + " }---> ";
            noAux = noAux.getProximoNo();
        }

        str += " null";
        return str;
    }

}