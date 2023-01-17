package operatorylogiczne.ocenyucznia;

public class Student {

    String firstName;
    String lastName;
    Boolean gender;
    // true: Male
    // false: Female
    double mathGrade;
    double itGrade;
    double physicsGrade;
    double average;

    public Student(String firstName, String lastName, boolean gender,
                   double mathGrade, double itGrade, double physicsGrade) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.mathGrade = mathGrade;
        this.itGrade = itGrade;
        this.physicsGrade = physicsGrade;

    }

    public void printOutAverageGrade() {
        this.average = average();
        // System.out.println("Dane studenta");
        System.out.println("Imię, Nazwisko: " + this.firstName + " " + this.lastName);
        // System.out.println("Ocena z fizyki: " + this.physicsGrade);
        // System.out.println(%"Ocena z matematyki: " + this.mathGrade);
        // System.out.println("Ocena z informatyki: " + this.itGrade);
        System.out.printf("Średnia arytmetyczna z ocen: %.2f %n %n", this.average);
    }

    double average() {
        double i;
        i = (this.itGrade
                + this.physicsGrade
                + this.mathGrade) / 3;
        return i;
    }

}
