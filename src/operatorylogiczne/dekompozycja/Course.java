package operatorylogiczne.dekompozycja;

import org.w3c.dom.ls.LSOutput;

public class Course {

    String name;
    float length;
    Cathegory cathegory;
    float price;

    public Course(String name , float length , Cathegory cathegory , float price) {
        this.name = name;
        this.length = length;
        this.cathegory = cathegory;
        this.price = price;
    }

    public void printoutCourse() {

        System.out.printf("Tytuł kursu kursu: %s \n", name);
        printoutCathegory();
        System.out.printf("Dlugośc kursu, min: %.0f\nCena kursu: %.0f\n\n", this.length, this.price);

    }

    public void printoutCathegory() {
        System.out.printf("Kurs nalezy do kategorii: %s\nOpis: %s\n", cathegory.name, cathegory.description);
    }

}
