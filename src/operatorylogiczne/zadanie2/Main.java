package operatorylogiczne.zadanie2;

public class Main {

    public static void main(String[] args) {

        String product1Producent = "Mlekowita";
        String product1Name = "Mleko";
        float product1Price = 2.5F;

        String product2Producent = "Wedel";
        String product2Name = "Czekolada";
        float product2Price = 2.19F;

        System.out.printf("%-16s %.1fzł\n", (product1Name + " " + product1Producent), product1Price);
        System.out.printf("%-16s %.2fzł\n", (product2Name + " " + product2Producent), product2Price);
    }
}
