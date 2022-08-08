package by.epam.tr.main3;

import java.util.Objects;

public class Airline {
	private String fromCity;
	private String toCity;
	private String flyNumber;
	private String aircraftTipe;
	private double departureTime;
	private String flyDay;

	public Airline() {
		fromCity = "";
		toCity = "";
		flyNumber = "";
		aircraftTipe = "";
		departureTime = 0.0;
		flyDay = "";

	}

	public Airline(String fromCity, String toCity, String flyNumber, String aircraftTipe, double departureTime,
			String flyDay) {
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.flyNumber = flyNumber;
		this.aircraftTipe = aircraftTipe;
		this.departureTime = departureTime;
		this.flyDay = flyDay;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getFlyNumber() {
		return flyNumber;
	}

	public void setFlyNumber(String flyNumber) {
		this.flyNumber = flyNumber;
	}

	public String getAircraftTipe() {
		return aircraftTipe;
	}

	public void setAircraftTipe(String aircraftTipe) {
		this.aircraftTipe = aircraftTipe;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public String getFlyDay() {
		return flyDay;
	}

	public void setFlyDay(String flyDay) {
		this.flyDay = flyDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aircraftTipe, departureTime, flyDay, flyNumber, fromCity, toCity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(aircraftTipe, other.aircraftTipe)
				&& Double.doubleToLongBits(departureTime) == Double.doubleToLongBits(other.departureTime)
				&& Objects.equals(flyDay, other.flyDay) && Objects.equals(flyNumber, other.flyNumber)
				&& Objects.equals(fromCity, other.fromCity) && Objects.equals(toCity, other.toCity);
	}

	@Override
	public String toString() {
		return "Airline [fromCity=" + fromCity + ", toCity=" + toCity + ", flyNumber=" + flyNumber + ", aircraftTipe="
				+ aircraftTipe + ", departureTime=" + departureTime + ", flyDay=" + flyDay + "]";
	}
	
}
	