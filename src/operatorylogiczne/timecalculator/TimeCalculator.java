package operatorylogiczne.timecalculator;

public class TimeCalculator {

    int daysToHours(int days) {
        return days * 24;
    }

    int allToSeconds(int days, int hours, int minutes, int seconds) {
        return days * 24 * 60 * 60 + hours * 60 * 60 + minutes * 60 + seconds;
    }

    int secondsToMinutes(int seconds) {
        int minutes = seconds / 60;
                return minutes;
    }
}
