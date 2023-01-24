package operatorylogiczne.zadanie34;

import operatorylogiczne.SpecialOffer;

public class Main {
    public static void main(String[] args) {

        Cathegory cathegory1 = new Cathegory("Produkty spożywcze", "Krótki termin przydatności do spożycia");
        Cathegory cathegory2 = new Cathegory("Jedzenie dla zwieżąt", "Mielone kopyta w ładnym opakowaniu");
        Product product1 = new Product("Mleko", 5.4F, "3.2", cathegory1);
        Product product2 = new Product("Kiełbasa krakowska", 67, "Bez konsnerwantów", cathegory1);
        Product product3 = new Product("Whiskas", 24, "Z wątróbką", cathegory2);
        SpecialOffer specialOffer1 = new SpecialOffer(product2, "Zbliżający się termin przydatności do spożycia", "01.03.2023", "05.03.2023", 0.2F);

    product1.printOut;
    product2.printOut;
    product3.printOut;

    }
}
