package library;

public class Map extends LibraryItem {

	private int scale;
	private String country;

	public Map(String title, Status status, int yearPublished, int scale, String country) {
		super(title, status, yearPublished);
		this.scale = scale;
		this.country = country;

	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
