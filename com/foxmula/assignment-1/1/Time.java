import java.util.*;

public class Time
{
    private int hour,min,sec;

    Time(){
        hour=0;
        min=0;
        sec=0;
    }

    Time(int hour, int min, int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }

    private Time add(Time m){
        Time time=new Time();
        time.hour = this.hour+m.hour;
        time.min = this.min+m.min;
        time.sec = this.sec+m.sec;
        if(time.sec>60){
            time.min = time.min + (time.sec/60);
            time.sec=time.sec-60;
        }
        if(time.min>60){
            time.hour = time.hour + (time.min/60);
            time.min=time.min-60;
        }
        return time;
    }

	public static void main(String[] args) {
		Time m1=new Time(2,60,10);
       	 	Time m2=new Time(5,3,60);
       		Time m3=m2.add(m1);
        	System.out.println(m3.hour+"-"+m3.min+"-"+m3.sec);
	}
}
