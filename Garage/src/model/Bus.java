package model;

public class Bus extends Vehicle {

	private int busNumber;
	private int numOfSeats;
	private String busCompany;

	public Bus(int wheels, String fuelType, double engineCapacity, String regNumber, int busNumber, int numOfSeats,
			String busCompany) {
		super(wheels, fuelType, engineCapacity, regNumber);
		this.busNumber = busNumber;
		this.numOfSeats = numOfSeats;
		this.busCompany = busCompany;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getBusCompany() {
		return busCompany;
	}

	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}

	public String toString() {
		return super.toString() + ", Bus Number: " + busNumber + ", Number of Seats: " + numOfSeats + ", Bus Company"
				+ busCompany + ", Vehicle Type: " + this.getClass().getSimpleName();
	}
}
