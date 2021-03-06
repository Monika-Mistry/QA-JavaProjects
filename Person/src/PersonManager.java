import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> personList = new ArrayList<Person>();

	public ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;

	}

	public void addPerson(Person p) {
		personList.add(p);
	}

	public void addNewPerson(String name, int age, String jobTitle) {
		personList.add(new Person(name, age, jobTitle));
	}

	public void removePerson(Person p) {
		personList.remove(p);
	}

	public Person searchPeopleByName(String name) {
		return personList.stream().filter(p -> p.getName().equals(name)).findFirst().get();
	}

	public Person searchPeopleByPerson(Person person) {
		return personList.stream().filter(p -> p.equals(person)).findFirst().get();
	}

	public void printAllPeople() {
		personList.stream().forEach(p -> System.out.println(p));
	}
}
