package by.epam.tr.main6;

import java.util.List;

public class CountryPrint {

	public void printCountry(Country country) {
		System.out.println("Capital of the country: " + country.getCapital());
	}

	public void printNumber(Country country) {
		int i = 0;
		List<Region> region = country.getCountry();
		for (Region a : region) {
			i++;

		}
		System.out.println("RegionNumber's are:" + i);
	}

	public void printRegion(Country country) {
		List<Region> region = country.getCountry();
		for (int i = 0; i < region.size(); i++) {
			System.out.println("Region capital is:" + region.get(i).getRegionCapital());

		}
	}

	public void printSquare(double square) {
		System.out.println("Square is: " + square);
	}
	public void printSquareRegion(Region region) {
		List<District> dis= region.getRegion();
		System.out.println("Region capital is: " + region.getRegionCapital());
		System.out.println("Regions city are:" );
		for(int i=0; i<dis.size();i++) {
			District s=dis.get(i);
			List<City> city = s.getDistrict();
			for (int j=0; j<city.size(); j++) {
				City c;
				c=city.get(j);
				System.out.print(c.getCityName() + ", ");
				
				
			}
		}
		System.out.println();
	}

}
