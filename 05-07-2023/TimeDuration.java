public class Duration {
    public static void main(String[] args) {
        Time time = new Time(100,70,56);
        time.printTime();
    }
}

class Time {
    private int seconds;
    private int minutes;
    private int hours;

    Time (int hours,int minutes,int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        validateTime();
    }

    public void validateTime () {
        if (hours>24) {
            hours = hours%24;
        } if (minutes>60) {
            minutes = minutes%60;
            incrementHours();
        } if (seconds>60) {
            seconds = seconds % 60;
            incrementMinutes();
        }
    }

    public void incrementHours() {
        if (hours == 24) {
            this.hours = 0;
        }
        hours = hours + 1;
    }

    public void incrementMinutes () {
        if (minutes == 60) {
            this.minutes = 0;
            incrementHours();
        } else
            minutes = minutes+1;
    }

    public void incrementSeconds () {
        if (seconds==60) {
            this.seconds = 0;
            incrementMinutes();
        }
        else {
            seconds = seconds + 1;
        }
    }

    public void printTime () {
        System.out.println(hours+" : "+minutes+" : "+seconds);
    }
}
