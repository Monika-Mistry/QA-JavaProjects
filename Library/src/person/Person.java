package person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import library.LibraryItem;

public abstract class Person {

	private String name;
	private Date dateOfBirth;
	private ArrayList<LibraryItem> itemsOnLoan = new ArrayList<LibraryItem>();
	private double libraryFines = 0.0;

	public Person(String name, String dob) {
		this.name = name;
		this.dateOfBirth = formatDate(dob);
	}
	
	private Date formatDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date;
		try {
				date = sdf.parse(input);
				return date;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		return new Date();

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
