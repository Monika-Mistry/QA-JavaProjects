package library;

public class Country extends Map {

	private String capital;

	public Country(String title, Status status, int yearPublished, int scale, String country, String capital) {
		super(title, status, yearPublished, scale, country);
		this.capital = capital;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
