package operatorylogiczne.ocenyucznia;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", true,
                5, 5, 4);
        Student student2 = new Student("Karol", "Brodzki", true,
                4, 3, 5);
        Student student3 = new Student("Paweł", "Olszewski", true,
                4, 4, 4.5);
        Student student4 = new Student("Sylwia", "Nowak", false,
                5, 4, 3.5);
        Student student5 = new Student("Beata", "Pęczak", false,
                4, 5, 4.5);

        student1.printOutAverageGrade();
        student2.printOutAverageGrade();
        student3.printOutAverageGrade();
        student4.printOutAverageGrade();
        student5.printOutAverageGrade();
    }
}
