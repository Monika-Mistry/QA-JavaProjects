package person;

import java.util.ArrayList;
import java.util.Date;

import library.LibraryItem;

public abstract class Person {

	private String name;
	private Date dateOfBirth;
	private ArrayList<LibraryItem> itemsOnLoan = new ArrayList<LibraryItem>();
	private double libraryFines = 0.0;

	public Person(String name, Date dob) {
		this.name = name;
		this.setDateOfBirth(dob);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dob) {
		this.dateOfBirth = dob;
	}

}
