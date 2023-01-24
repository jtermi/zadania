package operatorylogiczne.zadanie34;

public class Product {

    String name;
    float price;
    String description;
    Cathegory cathegory;

    public Product() {
    }

    public Product(String name , float price , String description , Cathegory cathegory) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.cathegory = cathegory;
    }
}
