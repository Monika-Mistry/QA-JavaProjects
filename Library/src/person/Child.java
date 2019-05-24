package person;

public class Child extends Person {

	private SchoolLevel schoolLevel;

	public Child(String name, String dob, SchoolLevel schoolLevel) {
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
