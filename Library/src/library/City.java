package library;

public class City extends Map {

	private String city;

	public City(String title, Status status, int yearPublished, int scale, String country, String city) {
		super(title, status, yearPublished, scale, country);
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
