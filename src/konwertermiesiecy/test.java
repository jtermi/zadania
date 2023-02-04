package konwertermiesiecy;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        MonthConverter converter = new MonthConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz numer miesiaca: ");
        int a = scanner.nextInt();

        converter.convert(a);
    }
}