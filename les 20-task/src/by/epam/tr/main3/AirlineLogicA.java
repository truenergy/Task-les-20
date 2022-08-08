package by.epam.tr.main3;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogicA {
	public boolean toCity(Airline fly) {
		String toCity = fly.getToCity();
		if (toCity.equals("Praga")) {
			return true;
		}
		return false;
	}

	public List<Airline> listToCity(List<Airline> fly) {
		List<Airline> result = new ArrayList<Airline>();
		for (Airline b : fly) {
			if (toCity(b)) {
				result.add(b);
			}
		}
		return result;

	}

	public boolean dayFly(Airline fly) {
		String dayFly = fly.getFlyDay();
		if (dayFly.equals("Monday")) {
			return true;
		}
		return false;
	}

	public List<Airline> listDayFly(List<Airline> fly) {
		List<Airline> result = new ArrayList<Airline>();
		for (Airline b : fly) {
			if (dayFly(b)) {
				result.add(b);
			}
		}
		return result;
	}

	public boolean timeFly(Airline fly) {
		String dayFly = fly.getFlyDay();
		double time = fly.getDepartureTime();
		if (dayFly.equals("Monday") && (time > 9.10)) {
			return true;
		}
		return false;
	}

	public List<Airline> listTimeFly(List<Airline> fly) {
		List<Airline> result = new ArrayList<Airline>();
		for (Airline b : fly) {
			if (timeFly(b)) {
				result.add(b);
			}
		}
		return result;
	}
}
