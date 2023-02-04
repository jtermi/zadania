package tydzien5.barman;

public class test {

    public static void main(String[] args) {

        Barman barman = new Barman();
        Drink drink = new Drink("Mojito", 25, true);
        Person person = new Person("Jan", "Kowalski", 18);

        barman.order(person, drink);

    }

}


