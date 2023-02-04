package tydzien5.users;

import javax.sound.midi.Soundbank;

public class UserManager {
    public static void main(String[] args) {

        String pesel;
        int age;
        String firstName;
        String lastName;

        User user = new User();
        user = user.newUser();

        System.out.println("Wiek: " + user.getAge());
        System.out.println("PESEL: " + user.getPesel());
        System.out.println("Imię: " + user.getFirstName());
        System.out.println("Nazwisko: " + user.getLastName());

    }
}
