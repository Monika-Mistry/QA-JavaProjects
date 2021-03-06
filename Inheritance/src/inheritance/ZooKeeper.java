package inheritance;

import java.util.ArrayList;

public class ZooKeeper {

	private ArrayList<Animal> zoo = new ArrayList<Animal>();

	public ArrayList<Animal> getZoo() {
		return zoo;
	}

	public void setZoo(ArrayList<Animal> zoo) {
		this.zoo = zoo;
	}

	public void addAnimal(Animal a) {
		zoo.add(a);
	}

	public void removeAnimal(Animal a) {
		zoo.remove(a);
	}

	public Animal searchAnimalByName(String name) {
		return zoo.stream().filter(a -> a.getName().equals(name)).findFirst().get();
	}

}
