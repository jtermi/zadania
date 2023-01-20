package operatorylogiczne.timemachine;

public class TimeMachine {

    public void backInTime (Person person) {
        person.age -= 1;
    }

    public void timeTravel (Person person, int years) {
        person.age += years;
    }

    public void printout (Person person) {
        System.out.println("Imię, nazwisko: " + person.firstName + " " + person.lastName );
        System.out.println("Wiek: " + person.age + " Adres zamieszkania: " + person.address + "\n");
           }
    }
