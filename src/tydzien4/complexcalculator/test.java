package tydzien4.complexcalculator;

public class test {

    public static void main(String[] args) {

        ComplexCalculator calculator = new ComplexCalculator();

        System.out.println("Wynik operaci: " + calculator.add("nowy", "napis\n"));
        System.out.println("Wynik operaci: " + calculator.add(2.3F, 4.7F) + "\n");

    }

}
