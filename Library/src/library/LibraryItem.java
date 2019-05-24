package library;

public abstract class LibraryItem implements CheckOutable, CheckInable {

	private String title;
	private Status status = Status.ONSHELF;
	private int yearPublished;

	public LibraryItem(String title, Status status, int yearPublished) {
		this.title = title;
		this.status = status;
		this.yearPublished = yearPublished;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isOnShelf() {
		return this.status == Status.ONSHELF;

	}

	@Override
	public boolean isOnLoan() {
		return this.status == Status.ONLOAN;
	}

}
