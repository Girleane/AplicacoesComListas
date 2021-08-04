package DuplaEncadeada;


public class Programa {
    public static void main(String[] args) {
        ListaDuplaEncadeada<String> minhaListaDupla = new ListaDuplaEncadeada<>();

        minhaListaDupla.add("0");
        minhaListaDupla.add("1");
        minhaListaDupla.add("2");
        minhaListaDupla.add("3");
        minhaListaDupla.add("4");
        minhaListaDupla.add("5");
        System.out.println(minhaListaDupla);

        minhaListaDupla.remove(3);
        System.out.println(minhaListaDupla);

        minhaListaDupla.add("99", 3);
        System.out.println(minhaListaDupla);

        System.out.println(minhaListaDupla.get(4));
    }
}
