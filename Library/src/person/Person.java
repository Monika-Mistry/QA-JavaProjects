package person;

import java.util.ArrayList;

import library.LibraryItem;

public abstract class Person {

	private String name;
	private int age;
	private ArrayList<LibraryItem> itemsOnLoan = new ArrayList<LibraryItem>();
	private double libraryFines = 0.0;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<LibraryItem> getItemsOnLoan() {
		return itemsOnLoan;
	}

	public void setItemsOnLoan(ArrayList<LibraryItem> itemsOnLoan) {
		this.itemsOnLoan = itemsOnLoan;
	}

	public double getLibraryFines() {
		return libraryFines;
	}

	public void setLibraryFines(double libraryFines) {
		this.libraryFines = libraryFines;
	}

}
