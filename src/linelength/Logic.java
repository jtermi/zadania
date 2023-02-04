package linelength;

public class Logic {

    void whichLineIsBiger(Line line1, Line line2) {
        double a = lineLength(line1);
        System.out.println("Długość linii A wynosi: " + a);
        double b = lineLength(line2);
        System.out.println("Długość linii B wynosi: " + b);
        if (a > b) {
            System.out.println("Pierwsz linia jest dłuższa"); }
        else if (a == b) {
            System.out.println("Obie linie są równe");
            } else
            System.out.println("Druga linia jest dłuższa");
    }

    double lineLength (Line line) {
        System.out.println("Obliczenie dlugosci linii");
        System.out.println("Punkt A linii: " + line.point1.point);
        System.out.println("Punkt B linii: " + line.point2.point);
        System.out.println();
        double temp = line.point2.point  - line.point1.point;
        if (temp > 0) {return temp; } else {return temp*(-1); }
    }
}
