package Circular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("1");
        minhaLista.add("2");
        minhaLista.add("3");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(4));
    }
}
