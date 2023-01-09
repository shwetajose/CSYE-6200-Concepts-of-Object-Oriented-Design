package edu.neu.csye6200;

public class Student extends Person implements Comparable<Student>{
	
	
	private double gpa;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, double gpa, String firstName, String lastName, int age) {
		super(id, firstName, lastName, age);
		this.gpa=gpa;
	}
	
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	@Override
	public String toString() {
		return "\nStudent [ID=" + getId() + ", GPA=" + gpa + ", First Name=" + getFirstName() + ", Last Name=" + 
                        getLastName()	+ ", Age=" + getAge() + "]\n";
	}

	
	/**
	 * Sort the collection of Student objects by Natural order
	 * (Student class implements Comparable interface)
	 */
	@Override
	public int compareTo(Student o) {
		
		if(gpa==o.gpa)  
			return 0;  
		else if(gpa>o.gpa)  
			return 1;  
		else  
			return -1;  
		
//		if(getId()==o.getId())
//			return 0;
//		else if(getId()>o.getId())
//			return 1;
//		else
//			return -1;
			}
	
	/**
	 * Student comparators for additional specific Student Sort ordering.
	 * @param o1 Student object
	 * @param o2 Student object
	 * @return integer result of comparison
	 */
	public static int compareByLastName(Student o1, Student o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
		      }
	
	public static int compareById(Student o1, Student o2) {
		return Integer.compare(o1.getId(), o2.getId());
		      }
	
	public static int compareByAge(Student o1, Student o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
		      }
	
	public static int compareByGPA(Student o1, Student o2) {
		return Double.compare(o1.getGpa(), o2.getGpa());
		      }
	

}
	