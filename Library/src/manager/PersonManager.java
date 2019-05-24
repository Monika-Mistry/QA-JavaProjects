package manager;

import java.util.ArrayList;

import person.Adult;
import person.Child;
import person.Person;
import person.SchoolLevel;

public class PersonManager {

	private ArrayList<Person> libraryUsers = new ArrayList<Person>();
	private static int userId = 1;

	private void addNewLibraryUser(Person p) {
		libraryUsers.add(p);
	}

	public void registerNewChild(String name, int age, int id, SchoolLevel schoolLevel) {

		addNewLibraryUser(new Child(name, age, schoolLevel));
	}

	public void registerNewAdult(String name, int age, int id, String jobTitle) {
		addNewLibraryUser(new Adult(name, age, jobTitle));
	}

	public void removeLibraryUser(Person p) {
		libraryUsers.remove(p);
	}

	public Person searchPersonByNameAge(String name, int age) {
		return libraryUsers.stream().filter(p -> (p.getName().equals(name) && p.getAge() == age)).findFirst().get();
	}

	// private Person searchPersonById(int id) {
	// return libraryUsers.stream().filter(p -> p.getPersonId() ==
	// id).findFirst().get();
	// }

	public ArrayList<Person> getLibraryUsers() {
		return libraryUsers;
	}

	public void setLibraryUsers(ArrayList<Person> libraryUsers) {
		this.libraryUsers = libraryUsers;
	}

	public void printAllUsers() {
		libraryUsers.stream().forEach(p -> System.out.println(p));
	}

	public static int getUserId() {
		return userId;
	}

	public static void setUserId(int userId) {
		PersonManager.userId = userId;
	}

}
