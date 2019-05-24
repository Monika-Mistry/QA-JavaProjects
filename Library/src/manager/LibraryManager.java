package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import library.LibraryItem;
import library.Status;

public class LibraryManager {

	private ArrayList<LibraryItem> libraryRecords = new ArrayList<LibraryItem>();

	public ArrayList<LibraryItem> getLibraryRecords() {
		return libraryRecords;
	}

	public void setLibraryRecords(ArrayList<LibraryItem> libraryRecords) {
		this.libraryRecords = libraryRecords;
	}

	public void addLibraryItem(LibraryItem item) {
		libraryRecords.add(item);
	}

	public void removeLibraryItem(LibraryItem item) {
		libraryRecords.remove(item);
	}

	public LibraryItem searchByTitle(String title) {
		return libraryRecords.stream().filter(l -> l.getTitle().equals(title)).findFirst().get();
	}

	public List<LibraryItem> searchByType(String type) {
		return libraryRecords.stream().filter(l -> l.getClass().getSimpleName().equals(type))
				.collect(Collectors.toList());
	}
	
	public void checkOutItem(LibraryItem item) {
		if(item.isOnShelf()) {
			item.setStatus(Status.ONLOAN);
			System.out.println("You have taken out " + item.getTitle());
		}
		else {
			switch(item.getStatus()) {
			case ONLOAN:
				System.out.println("Item Currently On-Loan");
				break;
			case REFERENCE:
				System.out.println("Reference Material Only");
				break;
			default:
				System.out.println("");
				break;
			}
		}
			
	}
	
	public void checkInItem(LibraryItem item) {
		if(item.isOnLoan()) {
			item.setStatus(Status.ONSHELF);
			System.out.println("You have returned " + item.getTitle());
		}
		else {
			System.out.println("This item is not On-Loan");
		}
	}

}
