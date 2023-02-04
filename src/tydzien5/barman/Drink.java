package tydzien5.barman;

public class Drink {

    private String name;
    private float price;
    private boolean ifAlco;

    public Drink(String name, float price, boolean ifAlco) {
        this.name = name;
        this.price = price;
        this.ifAlco = ifAlco;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public boolean isIfAlco() {
        return ifAlco;
    }
}
