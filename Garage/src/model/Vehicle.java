package model;

public abstract class Vehicle {

	private int wheels;
	private String fuelType;
	private double engineCapacity;
	private String regNumber;

	public Vehicle(int wheels, String fuelType, double engineCapacity, String regNumber) {
		this.wheels = wheels;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.regNumber = regNumber;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String toString() {
		return "Wheels: " + wheels + ", Fuel: " + fuelType + ", Engine Capacity: " + engineCapacity
				+ ", Registration Number: " + regNumber;
	}
}
