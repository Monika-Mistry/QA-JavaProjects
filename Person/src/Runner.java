
public class Runner {

	public static void main(String[] args) {

		PersonManager manager = new PersonManager();
		manager.addNewPerson("John", 21, "Student");
		manager.addNewPerson("Smith", 30, "Engineer");
		manager.addNewPerson("Jeff", 25, "Software Developer");
		manager.addNewPerson("Bob", 27, "Business Analyst");

		manager.printAllPeople();

		System.out.println("SEARCH RESULT: " + manager.searchPeopleByName("John"));

	}

}
