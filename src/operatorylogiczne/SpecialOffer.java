package operatorylogiczne;

import operatorylogiczne.zadanie34.Product;

public class SpecialOffer {

    Product product;
    String description;
    String startDate;
    String endDate;
    float discount;

    public SpecialOffer() {
    }

    public SpecialOffer(Product product , String description , String startDate , String endDate , float discount) {
        this.product = product;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
    }
}
