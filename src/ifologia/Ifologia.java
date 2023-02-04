package ifologia;

public class Ifologia {

    public static void main(String[] args) {
        int number = 0;
        int caseNumber = (number % 2);
        System.out.println("casenumber " + caseNumber);
        switch (caseNumber) {
            case 1:
                System.out.printf("Liczba %d jest nieparzysta", number);
                break;
            case 0:
                System.out.printf("Liczba %d jest parzysta", number);
                break;
            default:
                System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
        }
   }
}
