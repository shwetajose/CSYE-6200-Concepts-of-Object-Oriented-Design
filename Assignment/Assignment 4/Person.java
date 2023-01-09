package edu.neu.csye6200.assignment4;

public class Person {
	
	private int iD;
	private int age;
	private String firstName;
	private String lastName;
	private String parentFirstName;
	private String parentLastName;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Person(int iD, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
		super();
		this.iD = iD;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
	}

	
	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}

	
	@Override
	public String toString() {
		return "Person [iD=" + iD + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", parentFirstName=" + parentFirstName + ", parentLastName=" + parentLastName + "]";
	}
	
	

}
