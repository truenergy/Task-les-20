package by.epam.tr.main6;

import java.util.ArrayList;
import java.util.List;

public class CountryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<City> city1 = new ArrayList();
		city1.add(new City("Secunda", 105.00, 10000));
		city1.add(new City("Minute", 605.00, 15000));
		city1.add(new City("Hour", 240.00, 161000));

		List<City> city2 = new ArrayList();
		city2.add(new City("Moning", 550.00, 15000));
		city2.add(new City("Afternoon", 125.00, 76200));
		city2.add(new City("Night", 235.00, 176000));

		List<City> city3 = new ArrayList();
		city3.add(new City("First", 520.00, 10000));
		city3.add(new City("Second", 124.00, 16200));
		city3.add(new City("Third", 35.00, 76000));

		List<City> city4 = new ArrayList();
		city4.add(new City("Fourth", 320.00, 10000));
		city4.add(new City("Fifth", 24.00, 1200));
		city4.add(new City("Sixth", 135.00, 176000));
		
		District dis = new District("Time", city1);
		District dis1 = new District("Day", city2);
		District dis2 = new District("Number1", city3);
		District dis3 = new District("Number2", city4);
		
		
		List<District> district1 = new ArrayList();
		district1.add(dis);
		district1.add(dis1);

		List<District> district2 = new ArrayList();
		district2.add(dis3);
		district2.add(dis2);

		Region region1 = new Region("Region1", district1, "Capital1");
		Region region2 = new Region("Region2", district2, "Capital2");
		
	

		Country country = new Country();
		country.setCapital("MainCapital");
		country.add(region1);
		country.add(region2);
		
		CountryLog log = new CountryLog();
		double square = log.square(city4) + log.square(city3)+log.square(city2)+log.square(city1);

		CountryPrint print = new CountryPrint();
		print.printCountry(country);
		print.printNumber(country);
		//print.printRegion(country);
		print.printSquare(square);
		print.printSquareRegion(region1);
		print.printSquareRegion(region2);
		
		

	}

}
