package edu.neu.csye6200;

public class Person{
	
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person(){
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Person(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * Student ordering.
	 * @param o1 Person object
	 * @param o2 Person object
	 * @return integer result of comparison
	 */
	public static int compareByLastName(Person o1, Person o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
		      }
	
	public static int compareById(Person o1, Person o2) {
		Student x = (Student)o1;
		Student y = (Student)o2;
		return Integer.compare(x.getId(), y.getId());
		      }
	
	public static int compareByAge(Person o1, Person o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
		      }
	
	public static int compareByGPA(Person o1, Person o2) {
		Student x = (Student)o1;
		Student y = (Student)o2;
		return Double.compare(x.getGpa(), y.getGpa());
		      }
	
}
