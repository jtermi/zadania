package operatorylogiczne.kalkulator;

public class test {
    public static void main(String[] args) {
        float a = 56F;
        float b = 100F;
        float c = 97F;
        int x = 5;
        int y = 123;
        Calculator calculator = new Calculator();

        System.out.println("Wynik mnożenia 3ch liczb wyniesie: " + calculator.multiply(a,b,c) + "\n");

        calculator.subtractAndShow(x,y);

        System.out.println("Wynik odejmowania wyniesie: " + calculator.subtract(a,b) + "\n");

    }

}
