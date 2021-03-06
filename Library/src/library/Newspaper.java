package library;

public class Newspaper extends LibraryItem {

	private int monthPublished;
	private String genre;

	public Newspaper(String title, Status status, int yearPublished, int monthPublished, String genre) {
		super(title, status, yearPublished);
		this.monthPublished = monthPublished;
		this.genre = genre;
	}

	public int getMonthPublished() {
		return monthPublished;
	}

	public void setMonthPublished(int monthPublished) {
		this.monthPublished = monthPublished;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
