package HomeWork2.helloThyme.domain;

public class Student {

	private String fname, lname;

	public Student() {
		super();

	}

	public Student(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + "]";
	}

}
