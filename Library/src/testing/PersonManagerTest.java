package testing;

import org.junit.Test;

import manager.PersonManager;
import person.SchoolLevel;

public class PersonManagerTest {

	@Test
	public void personShouldBeRemoved() {

	}

	@Test
	public void searchForPersonShouldReturnPerson() {
		PersonManager pm = new PersonManager();

		pm.registerNewChild("Bob", 3, SchoolLevel.NURSERY);
		pm.registerNewChild("John", 11, SchoolLevel.SECONDARY);
		pm.registerNewAdult("Smith", 20, "student");

	}

}