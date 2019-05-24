package inheritance;

public class Dog extends Mammal {

	private String favouriteToy;

	public Dog(String name, int age, String colour, String breed, String favouriteToy) {
		super(name, age, colour, breed);
		this.favouriteToy = favouriteToy;
	}

	public String getFavouriteToy() {
		return favouriteToy;
	}

	public void setFavouriteToy(String favouriteToy) {
		this.favouriteToy = favouriteToy;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + name + " " + age + " " + colour + " " + breed + " "
				+ favouriteToy;
	}

	public String makeNoise() {
		return "Bark!";
	}

}
