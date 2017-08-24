import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();
		System.out.print("At the execution of this program, system local time is "); 
		getDate();
		System.out.println("Time elapsed since Unix Time Epoch:" + getTime()); //getTime()");
	}
	public static long getTime(){
		long unixTimestamp = System.currentTimeMillis();                              //Instant.now();
		int hour = (int) (unixTimestamp / (60 * 60 * 1000));
		int minute = (int) (unixTimestamp - hour * (60 * 60 * 1000)) / (60 * 1000);
		int second = (int) (unixTimestamp - hour * (60 * 60 * 1000) - minute * (60 * 1000))/ 1000;
		System.out.println("Hours:" + hour + " Minutes: " + minute + " Second: " + second);
		return unixTimestamp;
		
	}
	
	public static void getDate(){
		Date date = new Date();
		SimpleDateFormat dateNow = new SimpleDateFormat("E MMM dd hh:mm:ss z y");
	
		System.out.println( dateNow.format(date));
	}
	
}

//getEpochSeocond