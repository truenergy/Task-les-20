package by.epam.tr.main;

public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time (25, 59, 70);
		
		TimePrint view = new TimePrint();
		view.printTimeFirst(time);
		
		int hour = 23;
		int minute = 60;
		int secunda = 55;
		
		TimeLogic lastTime = new TimeLogic();
		lastTime.addTime(time, hour, minute, secunda);
		
		TimePrint view1 = new TimePrint();
		view1.printTimeLast(time);	
		
		
		
	}

}
