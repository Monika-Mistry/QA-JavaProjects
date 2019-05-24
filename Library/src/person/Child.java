package person;

public class Child extends Person {

	private SchoolLevel schoolLevel;

	public Child(String name, int age, SchoolLevel schoolLevel) {
		super(name, age);
		this.schoolLevel = schoolLevel;

	}

	public SchoolLevel getSchoolLevel() {
		return schoolLevel;
	}

	public void setSchoolLevel(SchoolLevel schoolLevel) {
		this.schoolLevel = schoolLevel;
	}

}
