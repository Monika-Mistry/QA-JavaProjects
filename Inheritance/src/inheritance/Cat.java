package inheritance;

public class Cat extends Mammal {

	private int catLives;

	public Cat(String name, int age, String colour, String breed, int catLives) {
		super(name, age, colour, breed);
		this.catLives = catLives;
	}

	public int getCatLives() {
		return catLives;
	}

	public void setCatLives(int catLives) {
		this.catLives = catLives;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + name + " " + age + " " + colour + " " + breed + " " + catLives;
	}

	public String makeNoise() {
		return "Meow!";
	}

	public boolean respire() {
		return catLives > 0;
	}

}
