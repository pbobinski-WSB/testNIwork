public class Main {

    public static void main(String[] args) {
        System.out.println("Hello WSB");

        Klasa1 klasa1 = new Klasa1("test");
        System.out.println(klasa1);

        Klasa2 klasa2 = new Klasa2();

        System.out.println(klasa2);

        System.out.println("Kolejna zmiana");

        KlasaMerge klasaMerge = new KlasaMerge(1);
        System.out.println(klasaMerge);
    }
}
