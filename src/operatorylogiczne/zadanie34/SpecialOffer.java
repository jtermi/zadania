package operatorylogiczne.zadanie34;

public class SpecialOffer {

    Product product;
    String description;
    float discount;
    String startDate;
    String endDate;

    public SpecialOffer() {
    }

    public SpecialOffer(Product product, String description, float discount, String startDate, String endDate) {
        this.product = product;
        this.description = description;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    void printOut() {
        System.out.println("Oferta specjalna");
        System.out.printf("Dotyczy produktu: %s, Opis produktu: %s\n", product.name, product.description);
        System.out.printf("Podstawowa cena produktu: %.1f\n", product.price);
        System.out.printf("Zniżka ofertowa: %.0f proc.\n", (discount * 100));
        System.out.printf("Cena po zniżce: %.2f\n\n", (product.price * (1 - discount)));
    }

}
