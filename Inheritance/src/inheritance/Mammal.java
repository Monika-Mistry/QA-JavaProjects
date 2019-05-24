package inheritance;

public class Mammal extends Animal {

	protected String breed;

	public Mammal(String name, int age, String colour, String breed) {
		super(name, age, colour);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
