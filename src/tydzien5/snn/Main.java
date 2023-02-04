package tydzien5.snn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();

        System.out.println("Wprowadz liczbe a: ");
        a = scanner.nextInt();
        System.out.println("Wprowadz liczbe b: ");
        b = scanner.nextInt();
        System.out.println("Wprowadz liczbe c: ");
        c = scanner.nextInt();

        System.out.println("\nNajwiększa liczba to: " + logic.greatest(a,b,c));
        System.out.println("\nNajmniejsza liczba to: " + logic.least(a,b,c));
        System.out.println("\nŚrednia z liczb to: " + logic.average(a,b,c));
    }
}
