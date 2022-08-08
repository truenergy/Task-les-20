package by.epam.tr.main6;

import java.util.List;

public class CountryLog {

	public double square (List<City> city) {
		double square = 0;
		for (City a: city) {
			square= square + a.getCitySquare();
			}
		return square;
	}
	
}
