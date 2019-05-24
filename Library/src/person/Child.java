package person;

import java.util.Date;

public class Child extends Person {

	private SchoolLevel schoolLevel;

	public Child(String name, Date dob, SchoolLevel schoolLevel) {
		super(name, dob);
		this.schoolLevel = schoolLevel;

	}

	public SchoolLevel getSchoolLevel() {
		return schoolLevel;
	}

	public void setSchoolLevel(SchoolLevel schoolLevel) {
		this.schoolLevel = schoolLevel;
	}

}
