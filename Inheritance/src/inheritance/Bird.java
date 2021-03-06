package inheritance;

public class Bird extends Animal {

	public Bird(String name, int age, String colour) {
		super(name, age, colour);
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + name + " " + age + " " + colour;
	}

}
