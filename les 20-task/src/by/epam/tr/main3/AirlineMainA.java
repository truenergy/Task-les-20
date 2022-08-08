package by.epam.tr.main3;

import java.util.ArrayList;
import java.util.List;

public class AirlineMainA {
	public static void main(String[] args) {
		List<Airline> fly = new ArrayList<Airline>();
		fly.add(new Airline("Minsk", "Warsawa", "FR 985", "Boing", 00.15, "Monday"));
		fly.add(new Airline("Minsk", "Praga", "FY 158", "Aerobus", 10.25, "Monday"));
		fly.add(new Airline("Minsk", "Rome", "YS 362", "Boing C737", 14.30, "Tuesday"));
		fly.add(new Airline("Minsk", "Warsawa", "FR 985", "Boing C737", 00.15, "Friday"));
		fly.add(new Airline("Minsk", "Praga", "FY 158", "Aerobus", 10.25, "Thursday"));
		fly.add(new Airline("Minsk", "Rome", "YS 362", "Boing C737", 14.30, "Friday"));

		List<Airline> toCity = new ArrayList();
		List<Airline> dayFly = new ArrayList();
		List<Airline> timeFly = new ArrayList();

		AirlineLogicA logic = new AirlineLogicA();
		toCity = logic.listToCity(fly);
		dayFly = logic.listDayFly(fly);
		timeFly = logic.listTimeFly(fly);

		AirlineView view = new AirlineView();
		view.printCity(toCity);
		view.printDay(dayFly);
		view.printTime(timeFly);
	}
}
