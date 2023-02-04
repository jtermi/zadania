package tydzien5.barman;

public class Barman {

        public void order(Person person, Drink drink) {
            if (person.getAge() < 18 && drink.isIfAlco()) {
                System.out.println("Nie sprzedajemy alkoholu nieletnim");
            } else {
                System.out.printf("%s, Twój drink jest gotowy do odbioru. Kwota do zapłaty %.0f zł.",
                        person.getFirstName(), drink.getPrice());
            }
       }

}
