package library;

import java.util.ArrayList;

public class NonFiction extends Book {

	private String subject;
	private int edition;

	public NonFiction(String title, Status status, int yearPublished, String isbn, int pages, ArrayList<String> authors,
			String subject, int edition) {
		super(title, status, yearPublished, isbn, pages, authors);
		this.subject = subject;
		this.edition = edition;
	}

	public String getCategory() {
		return subject;
	}

	public void setCategory(String category) {
		this.subject = category;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

}
