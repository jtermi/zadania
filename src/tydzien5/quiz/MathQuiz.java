package tydzien5.quiz;

import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        double answer;
        int counter = 0;
        Logic logic = new Logic();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaki jest wynik mnożenia 3 * 5:");
        answer = scanner.nextDouble();
        if (logic.question1(answer)) counter++;
            System.out.println("counter: " + counter);

        System.out.println("Jakie jest pole kwadratu o boku 12:");
        answer = scanner.nextDouble();
        if (logic.question2(answer)) counter++;
        System.out.println("counter: " + counter);
        System.out.println("Ile wynosi pierwiastek kwadratowy z 15129");
        answer = scanner.nextDouble();
        if (logic.question3(answer)) counter++;
        System.out.println("counter: " + counter);
        System.out.println();

        System.out.printf("Twój wynik finalny to: ( %d / 3 ) ", counter);
    }
}
