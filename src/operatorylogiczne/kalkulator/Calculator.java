package operatorylogiczne.kalkulator;

public class Calculator {

    float multiply (float a, float b, float c) {
        return a * b * c;
    }

    void subtractAndShow (int x, int y) {
        System.out.println("Wynik odejmowania b od a wynosi: " + (x-y) + "\n");
    }

    float subtract (float a, float b) {
        return (a - b);
    }
}
