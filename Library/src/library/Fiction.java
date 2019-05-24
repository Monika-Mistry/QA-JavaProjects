package library;

import java.util.ArrayList;

public class Fiction extends Book {

	private String genre;

	public Fiction(String title, Status status, int yearPublished, String isbn, int pages, ArrayList<String> authors,
			String genre) {
		super(title, status, yearPublished, isbn, pages, authors);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
