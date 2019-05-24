package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import library.LibraryItem;

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

}
