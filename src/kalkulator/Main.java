package kalkulator;

import java.text.BreakIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        calculator calc = new calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe A: ");
        int a = scanner.nextInt();
        System.out.println("Wprowadz liczbe B: ");
        int b = scanner.nextInt();

        int pointer = calc.pointer(a,b);
        calc.rezultat(pointer, a, b);

    }
}
