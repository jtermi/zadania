package operatorylogiczne.timemachine;

public class test {
    public static void main(String[] args) {

        Person person1 = new Person("John", "Kowalski", 20, "Wrocław");
        TimeMachine timeMachine = new TimeMachine();
        timeMachine.timeTravel(person1, 5);
        System.out.println(person1.age); //25

        timeMachine.printout(person1);
        timeMachine.backInTime(person1);
        timeMachine.backInTime(person1);
        timeMachine.backInTime(person1);
        timeMachine.printout(person1);

        timeMachine.timeTravel(person1, -5);
        timeMachine.printout(person1);
    }
}
