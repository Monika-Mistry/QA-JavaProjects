package inheritance;

public class Animal {

	protected String name;
	protected int age;
	protected String colour;

	public Animal(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String toString() {
		return name + " " + age + " " + colour;
	}

	public String makeNoise() {
		return "Noise";
	}

	public boolean respire() {
		return true;
	}

}
