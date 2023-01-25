package tydzien4.complexcalculator;

public class ComplexCalculator {

    public ComplexCalculator() {
    }

    public String add(String line1, String line2) {
        System.out.println("To jest metoda służąca do dodawania stringów");
        System.out.printf("Wejściowe dane to %S oraz %S\n", line1, line2);
        return line1 + line2;
    }

    public float add(float a, float b) {
        System.out.println("To jest metoda służąca do dodawania liczb zmiennoprzecinkowych");
        System.out.printf("Wejściowe dane to %.2f oraz %.2f\n", a, b);
        return a + b;
    }
}
