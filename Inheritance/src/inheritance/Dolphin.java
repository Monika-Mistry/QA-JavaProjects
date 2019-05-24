package inheritance;

public class Dolphin extends Mammal {

	private String location;

	public Dolphin(String name, int age, String colour, String breed, String location) {
		super(name, age, colour, breed);
		this.location = location;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + name + " " + age + " " + colour + " " + breed + " " + location;
	}

	public String makeNoise() {
		return "Click Click!";
	}
}
