package 평가연습_23일;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Controller {
	
	
	public static ArrayList<Parking> carlist = new ArrayList<>();
	
	Date carInTime  = new Date();
	SimpleDateFormat cardate = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
	String date = cardate.format(carInTime);
	
	public void in_Parking(String inParking_Car_Number) {
		
	}
	
	public void out_Oarking(String outParking_Car_Number) {
		
	}
	
}
