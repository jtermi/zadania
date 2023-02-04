package linelength;

public class Main {

    public static void main(String[] args) {

        Line line1 = new Line(-5D, 5D);
        Line line2 = new Line(2D, 1D);

        Logic logic = new Logic();

        logic.whichLineIsBiger(line1, line2);

    }
}
