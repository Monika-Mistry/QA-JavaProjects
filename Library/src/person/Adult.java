package person;

import java.util.Date;

public class Adult extends Person {

	private String jobTitle;

	public Adult(String name, Date dob, String jobTitle) {
		super(name, dob);
		this.jobTitle = jobTitle;

	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
