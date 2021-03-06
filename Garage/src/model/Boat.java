package model;

public class Boat extends Vehicle {

	private int numOfLifeJackets;
	private double sizeOfBoat;
	private double maxSpeed;

	public Boat(int wheels, String fuelType, double engineCapacity, String regNumber, int numOfLifeJackets,
			double sizeOfBoat, double maxSpeed) {
		super(wheels, fuelType, engineCapacity, regNumber);
		this.numOfLifeJackets = numOfLifeJackets;
		this.sizeOfBoat = sizeOfBoat;
		this.maxSpeed = maxSpeed;
	}

	public int getNumOfLifeJackets() {
		return numOfLifeJackets;
	}

	public void setNumOfLifeJackets(int numOfLifeJackets) {
		this.numOfLifeJackets = numOfLifeJackets;
	}

	public double getSizeOfBoat() {
		return sizeOfBoat;
	}

	public void setSizeOfBoat(double sizeOfBoat) {
		this.sizeOfBoat = sizeOfBoat;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String toString() {
		return super.toString() + ", Number Of Life Jackets: " + numOfLifeJackets + ", Size Of Boat: " + sizeOfBoat
				+ ", Maximum Speed:" + maxSpeed + ", Vehicle Type: " + this.getClass().getSimpleName();
	}

}
