package operatorylogiczne.radio;

public class test {

    public static void main(String[] args) {

        Radio radio1 = new Radio(50, 128.5F, 'F');
        Radio radio2 = new Radio(70, 114.0F, 'A');

        radio1.printout();
        radio2.printout();

    }
}
