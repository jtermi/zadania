package operatorylogiczne.timecalculator;

public class test {

    public static void main(String[] args) {

        TimeCalculator timeCalculator = new TimeCalculator();
        int days = 5;
        int hours = 15;
        int minutes = 34;
        int seconds = 5;

        System.out.println("Ilość godzin wynosi: " + timeCalculator.daysToHours(days) + "\n");
        System.out.println("Ilość sekund wynosi: " + timeCalculator.allToSeconds(days, hours, minutes, seconds) + "\n");
        seconds = 534;

        System.out.println("Ilość minut w podanych sekundach wynosi: " + timeCalculator.secondsToMinutes(seconds) + "\n");
    }
}
