package HomeWork2.helloThyme.domain;

public class Friend {

	private String fullName;

	public Friend() {
		super();

	}

	public Friend(String fullName) {
		super();
		this.fullName = fullName;

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Friend [fullName = " + fullName + "]";
	}

}
