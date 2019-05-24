package model;

public class Car extends Vehicle {

	private int numOfDoors;
	private int bootSize;
	private boolean rightHandDrive;
	private String colour;

	public Car(int wheels, String fuelType, double engineCapacity, String regNumber, int doors, int bootSize,
			boolean rightHandDrive, String colour) {
		super(wheels, fuelType, engineCapacity, regNumber);
		this.numOfDoors = doors;
		this.bootSize = bootSize;
		this.rightHandDrive = rightHandDrive;
		this.colour = colour;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int doors) {
		this.numOfDoors = doors;
	}

	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	public boolean isRightHandDrive() {
		return rightHandDrive;
	}

	public void setRightHandDrive(boolean rightHandDrive) {
		this.rightHandDrive = rightHandDrive;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String toString() {
		return super.toString() + ", Number Of Doors: " + numOfDoors + ", Size Of Boot: " + bootSize
				+ ", Right-Hand Drive? " + rightHandDrive + ", Colour:" + colour + ", Vehicle Type: "
				+ this.getClass().getSimpleName();
	}
}
