package operatorylogiczne.timer;

public class Timer {

    int seconds;
    int minutes;
    int hours;
    String time;

    void addSeconds(int seconds) {
        this.seconds += seconds;
        if (this.seconds >=60 ) {
            this.minutes += 1;
            this.seconds -=60;
        }
    }

    void addMinutes(int minutes) {
        this.minutes += minutes;
        if (this.minutes >= 60 ) {
            this.hours += 1;
            this.minutes -= 60;
        }
    }

    void addHours(int hours) {
        this.hours += hours;
    }
    void step() {
        this.seconds += 1;
    }

    public String getTime() {
        time = this.hours + "h:" + this.minutes + "m:" + this.seconds + "s";
        return (time);
    }

    public long getSeconds() {
        int seconds;
        seconds = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
        return seconds;
    }

}
