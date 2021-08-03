package Encadeadas;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("1");
        minhaListaEncadeada.add("2");
        minhaListaEncadeada.add("3");
        minhaListaEncadeada.add("4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);
    }

}
