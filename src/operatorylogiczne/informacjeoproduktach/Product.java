package operatorylogiczne.informacjeoproduktach;

public class Product {

    String productName;
    String producer;
    double price;
    boolean avaliability;

    public Product(String productName, String producer, double price, boolean avaliability) {
        this.productName = productName;
        this.producer = producer;
        this.price = price;
        this.avaliability = avaliability;
    }

    public void drukarka() {

        System.out.println();
        System.out.println("Nazwa produktu: " + this.productName);
        System.out.println("Producent: " + this.producer);
        System.out.println("Cena w PLN: " + this.price);
        System.out.println("Dostępność produktu: " + this.avaliability);

    }

}
