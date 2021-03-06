package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public void fixAllVehicles() {
		for (Vehicle v : vehicleList) {
			switch (v.getClass().getSimpleName()) {
			case "Car":
				System.out.println("The total cost to fix your vehicle is �" + (v.getEngineCapacity() * 100));
				break;
			case "Boat":
				System.out.println("The total cost to fix your vehicle is �" + (v.getEngineCapacity() * 150));
				break;
			case "Bus":
				System.out.println("The total cost to fix your vehicle is �" + (v.getEngineCapacity() * 250));
				break;
			}
		}

	}

	public void fixVehicle(Vehicle v) {
		switch (v.getClass().getSimpleName()) {
		case "Car":
			System.out.println("The total cost to fix your vehicle is �" + v.getEngineCapacity() * 100);
			break;
		case "Boat":
			System.out.println("The total cost to fix your vehicle is �" + v.getEngineCapacity() * 150);
			break;
		case "Bus":
			System.out.println("The total cost to fix your vehicle is �" + v.getEngineCapacity() * 250);
			break;
		}
	}

	public void removeVehicle(Vehicle v) {
		vehicleList.remove(v);
	}

	public List<Vehicle> searchByVehicleType(String vehicleType) {
		return vehicleList.stream().filter(v -> v.getClass().getSimpleName().equals(vehicleType))
				.collect(Collectors.toList());
	}

	public Vehicle searchByRegNumber(String reg) {
		return vehicleList.stream().filter(v -> v.getRegNumber().equals(reg)).findFirst().get();
	}

	public void emptyGarage() {
		vehicleList.clear();
		System.out.println("All Vehicles Fixed");
	}

	public void printAllVehicles() {
		vehicleList.stream().forEach(v -> System.out.println(v));

	}

}
