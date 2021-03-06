package library;

import java.util.ArrayList;

public abstract class Book extends LibraryItem {

	private String isbn;
	private int pages;
	private ArrayList<String> authors;

	public Book(String title, Status status, int yearPublished, String isbn, int pages, ArrayList<String> authors) {
		super(title, status, yearPublished);
		this.isbn = isbn;
		this.pages = pages;
		this.authors = authors;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

}
