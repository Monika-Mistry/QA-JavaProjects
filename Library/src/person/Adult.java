package person;

public class Adult extends Person {

	private String jobTitle;

	public Adult(String name, int age, String jobTitle) {
		super(name, age);
		this.jobTitle = jobTitle;

	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
