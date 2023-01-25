package operatorylogiczne.zadanie34;

import java.sql.SQLOutput;

public class Product {

    String name;
    float price;
    String description;
    Cathegory cathegory;

    public Product() {
    }

    public Product(String name, float price, String description, Cathegory cathegory) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.cathegory = cathegory;
    }

    void printOut() {
        SpecialOffer testspecialOffer = new SpecialOffer();
        System.out.println("Informacje o produkcie");
        System.out.printf("Nazwa produktu: %S, Opis produktu: %S\n", name, description);
        System.out.printf("Podstawowa cena produktu: %.0f\n", price);
        System.out.printf("Produkt należy do kategorii: %S, %S\n\n", cathegory.name, cathegory.description);
    }
}


