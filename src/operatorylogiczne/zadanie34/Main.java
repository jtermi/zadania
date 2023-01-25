package operatorylogiczne.zadanie34;

public class Main {

    public static void main(String[] args) {

        Cathegory cathegory1 = new Cathegory("Nabiał", "Krótki termin przydatności do spożycia");
        Cathegory cathegory2 = new Cathegory("Jedzenie dla zwieżąt", "Sucha karma");
        Product product1 = new Product("Mleko 3.2%", 4.5F, "Mleko niepasteryzowane", cathegory1);
        Product product2 = new Product("Ser żółty Edam", 34.5F, "Ser w plasterkach. Opakowanie ekonomiczne", cathegory1);
        Product product3 = new Product("Whiskas", 24, "Karma dla kota dorosłego", cathegory2);

        product1.printOut();
        product2.printOut();
        product3.printOut();

        SpecialOffer specialOffer1 = new SpecialOffer(product1, "Oferta1", .2F, "14 lutego", "15 lutego");

        specialOffer1.printOut();

    }

}
