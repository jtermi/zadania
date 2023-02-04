package kalkulator;

public class calculator {

    void sum(int a, int b) {
        System.out.println("Suma liczb wynosi: " + (a+b));
    }

    void product(int a, int b) {
        System.out.println("Iloczyn liczb wynosi: " + a*b);
    }

    void power(int a, int b) {
        System.out.println("Kwadrat liczby wynosi: " + a*b);
    }

    int pointer (int a, int b) {
        if (a > b) { return 1; } else if (a < b) { return -1; } else { return 0; }
    }

    void rezultat(int pointer, int a, int b) {
        switch (pointer) {
            case (-1):
                System.out.println(" A jest mniejsze od B");
                product(a,b);
                break;
            case 0:
                System.out.println(" A jest równe B");
                power(a,b);
                break;
            case 1:
                System.out.println("A jest większe od B");
                pointer(a,b);
        }
        }
    }

