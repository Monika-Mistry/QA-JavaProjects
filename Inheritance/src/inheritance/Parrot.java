package inheritance;

public class Parrot extends Bird {

	private double wingspan;

	public Parrot(String name, int age, String colour, double wingspan) {
		super(name, age, colour);
		this.wingspan = wingspan;
	}

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public String toString() {
		return this.getClass().getSimpleName() + " " + name + " " + age + " " + colour + " " + wingspan;
	}

	public String makeNoise() {
		return "My Name is " + name;
	}

	public String fly() {
		return "Flap flap";
	}

}
