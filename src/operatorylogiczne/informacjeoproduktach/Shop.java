package operatorylogiczne.informacjeoproduktach;

public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product("Gouda", "Mlekowita", 40.5, true);
        Product product2 = new Product("Edam", "Mlekowita", 38.5, true);
        Product product3 = new Product("Krakowska sucha", "Rogi&Kopyta", 12.5, false);
        Product product4 = new Product("Spaghetti 5", "Barilla", 10, true);

        product1.drukarka();
        product2.drukarka();
        product3.drukarka();
        product4.drukarka();

    }

}
