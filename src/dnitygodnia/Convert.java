package dnitygodnia;

public class Convert {

    String convert(int day) {
        switch (day) {
            case 1:
                return "poniedzialek";
            case 2:
                return "wtorek";
            case 3:
                return "środa";
            case 4:
                return "czwartek";
            case 5:
                return "piątek";
            case 6:
                return "sobota";
            case 7:
                return "niedziela";
            default:
                return "niepoprawna liczba";
        }
    }

    String ifWorkingDay(int day) {
        switch (day) {
            case 1, 2, 3, 4, 5:
                return "Dzień robocyz";
            case 6, 7:
                return "Dzień wolny od pracy";
            default:
                return "Niepoprawna liczba";
        }
    }
}