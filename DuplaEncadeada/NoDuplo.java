package DuplaEncadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noAnt;
    private NoDuplo<T> noPos;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoAnt() {
        return noAnt;
    }

    public void setNoAnt(NoDuplo<T> noAnt) {
        this.noAnt = noAnt;
    }

    public NoDuplo<T> getNoPos() {
        return noPos;
    }

    public void setNoPos(NoDuplo<T> noPos) {
        this.noPos = noPos;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
