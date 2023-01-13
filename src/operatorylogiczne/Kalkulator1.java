package operatorylogiczne;

public class Kalkulator1 {
    public static void main(String[] args) {

        double a = 12.0;
        double b = 5.5;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println("Czy liczba a jest większa od 0? " + (a > 0));
        System.out.println("Czy suma jest parzysta? " + ((a + b) % 2 == 0));
        System.out.println("Czy a lub b jest większa od 100? " + ((a > 100) || (b > 100)));
        System.out.println("Czy a i b jest większa od 100? " + ((a > 100) && (b > 100)));

    }
}
