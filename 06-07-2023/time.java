public class Main
{
    public static void main(String[] args) {
    Time t = new Time();
    t.setHours(61);
    t.setMinutes(70);
    t.setSeconds(70);
    t.display();
    
}  
    
class Time{
    private int hours;
    private int minutes;
    private int seconds;

    {
        this.minutes=(minutes >= 0 && minutes <= 59) ? minutes : (minutes % 60);
        this.seconds = (seconds >= 0 && seconds <= 59) ? seconds : (seconds % 60);
        this.hours = (hours >= 0 && hours <= 23) ? hours : (hours%24);
    }

    public  Time(){

    }

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours){
        this.hours = validateHours(hours);
    }

    public void setMinutes(int minutes){
        this.minutes = validateMinutes(minutes);
    }

    public void setSeconds(int seconds){
        this.seconds = validateSeconds(seconds);
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    private int validateMinutes(int minutes){
        return (minutes >= 0 && minutes <= 59) ? minutes : (minutes % 60);
    }

    private int validateSeconds(int seconds){
        return (seconds >= 0 && seconds <= 59) ? seconds : (seconds % 60);
    }

    private int validateHours(int hours){
        return (hours >= 0 && hours <= 23) ? hours : (hours%24);
    }

    public void display(){
        while(true)
        {
            System.out.println(hours+":"+minutes+":"+seconds);
            if(seconds>=0 && seconds<=59){
                seconds++;
            }else if(seconds == 60){
                seconds =0;

                if(minutes>=0 && minutes<=59){
                    minutes++;
                }
                else if(minutes == 60){
                    minutes = 0;

                    if(hours>=0 && hours <= 23){
                        hours++;
                    }
                    else if(hours == 24){
                        hours = 0;
                    }
                }
            }
        }
    }
}

}
