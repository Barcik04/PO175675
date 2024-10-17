public class Time {
    int hours;
    int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time addTime(int hours, int minutes) {
        this.minutes += minutes;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;

        this.hours += hours;
        this.hours = this.hours % 24;




        return new Time(this.hours, this.minutes);
    }

    public String toString() {
        return String.format("%02d:%02d", this.hours, this.minutes);
    }


}
