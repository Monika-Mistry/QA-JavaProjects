package logic;

import model.Boat;
import model.Bus;
import model.Car;
import model.Garage;

public class App {

	public static void main(String[] args) {
		Garage myGarage = new Garage();
		Car myCar1 = new Car(4, "Petrol", 1.4, "AB12 3CD", 5, 5, true, "blue");
		Bus myBus1 = new Bus(6, "Diesel", 5, "AAAAAA", 9, 50, "StageCoach");
		Boat myBoat1 = new Boat(0, "Diesel", 1, "Yachtstar", 3, 5, 30);

		myGarage.addVehicle(myCar1);
		myGarage.addVehicle(myBus1);
		myGarage.addVehicle(myBoat1);

		myGarage.printAllVehicles();
		System.out.println();
		myGarage.fixAllVehicles();
		System.out.println();
		myGarage.fixVehicle(myCar1);

		System.out.println();

		System.out.println(myGarage.searchByVehicleType("Car"));
		System.out.println();
		System.out.println(myGarage.searchByRegNumber("AAAAAA"));
		System.out.println();
		myGarage.removeVehicle(myGarage.searchByRegNumber("Yachtstar"));
		myGarage.printAllVehicles();
		System.out.println();
		myGarage.emptyGarage();

	}

}
