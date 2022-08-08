package by.epam.tr.main3;

import java.util.List;

public class AirlineView {
	public void printCity(List<Airline> fly) {
		for (Airline b : fly) {
			System.out.println("City: " + b.getToCity() + ", number fly:" + b.getFlyNumber() + ", day fly: "
					+ b.getFlyDay() + ", departure time" + b.getDepartureTime());

		}

	}

	public void printDay(List<Airline> fly) {
		for (Airline b : fly) {
			System.out.println("Day fly: " + b.getFlyDay() + ", fly to city: " + b.getToCity() + ", number fly:"
					+ b.getFlyNumber() + ", departure time" + b.getDepartureTime());

		}

	}

	public void printTime(List<Airline> fly) {
		for (Airline b : fly) {
			System.out.println("Day fly: " + b.getFlyDay() + ", departure time" + b.getDepartureTime()
					+ ", fly to city: " + b.getToCity() + ", number fly:" + b.getFlyNumber());

		}

	}
}
