package tydzien5.users;

import java.util.Scanner;

public class User {
    public User(String pesel, int age, String firstName, String lastName) {
        this.pesel = pesel;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public String getPesel() {
        return pesel;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String pesel;
    private int age;
    private String firstName;
    private String lastName;

    User newUser() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz PESEL:");
        user.pesel = scanner.nextLine();

        System.out.println("Wprowadz wiek:");
        user.age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Wprowadz imię:");
        user.firstName = scanner.nextLine();

        System.out.println("Wprowadz nazwisko:");
        user.lastName = scanner.nextLine();

        return user;

    }
}
