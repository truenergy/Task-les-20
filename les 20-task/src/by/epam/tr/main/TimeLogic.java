package by.epam.tr.main;

public class TimeLogic {
	public void addTime(Time time, int hour, int minute, int secunda) {
		int lastHour, lastMinute, lastSecunda;

		lastSecunda = secunda + time.getSecunda();
		lastMinute = minute + time.getMinute();
		lastHour = hour + time.getHour();

		if (lastSecunda >= 60) {
			while (lastSecunda >= 60) {
				lastMinute = lastMinute + 1;
				lastSecunda = lastSecunda - 60;
			}
		}

		if (lastMinute >= 60) {
			while (lastMinute >= 60) {
				lastHour = lastHour + 1;
				lastMinute = lastMinute - 60;
			}
		}

		if (lastHour >= 24) {
			while (lastHour >= 24) {
				lastHour = lastHour - 24;
			}
		}
		time.setHour(lastHour);
		time.setMinute(lastMinute);
		time.setSecunda(lastSecunda);
		

	}

}
