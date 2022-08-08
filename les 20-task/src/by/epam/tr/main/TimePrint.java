package by.epam.tr.main;

public class TimePrint {
	public void printTimeFirst(Time time) {
		System.out.println("First time is: " +time.getHour() + "h " + time.getMinute() + "min " + time.getSecunda() + "sec ");
	}
	
	public void printTimeLast(Time time) {
		System.out.println("Last time is: " +time.getHour() + "h " + time.getMinute() + "min " + time.getSecunda() + "sec ");
	}
}