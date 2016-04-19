package us.riftmc.htgan.bgconfig;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {
//	private int phoneNumber;
//	private String emailAddress;
	
	public static void main(String[] args) {
		System.out.println(getClock().toString());
	}
	
	private static ArrayList<String> getClock() {
		ArrayList<String> clock = new ArrayList<String>();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		
		clock.add("Clock Year=" + calendar.get(Calendar.YEAR)+ "\n");
		clock.add("Clock Month=" + calendar.get(Calendar.MONTH)+ "\n");
		clock.add("Clock Day=" + calendar.get(Calendar.DATE)+ "\n");
		clock.add("Clock Hour=" + calendar.get(Calendar.HOUR)+ "\n");
		clock.add("Clock Minute=" + calendar.get(Calendar.MINUTE)+ "\n");
		clock.add("Clock Second=" + calendar.get(Calendar.SECOND)+ "\n");
		
		return clock;
	}
}
