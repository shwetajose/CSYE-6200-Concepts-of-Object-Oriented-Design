package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {
	
	public static void demo() {
		
		/**
		 * Student API add and compare methods
		 */
		List<Student> studentRoster = new ArrayList<Student>();
		
		studentRoster.add(new Student(1,3.2, "Harry", "Potter", 20));
		studentRoster.add(new Student(2,4.0, "Hermione", "Granger", 25));
		studentRoster.add(new Student(3,3.5, "Draco", "Malfoy", 21));
		studentRoster.add(new Student(4,2.7, "Lord", "Voldemort", 30));
		studentRoster.add(new Student(5,3.0, "Rubeus", "Hagrid", 30));
		
		/**
		 * Sorting students using Comparable Interface
		 * compareTo() is used to sort based on GPA
		 */  
		Collections.sort(studentRoster);
		//students.sort(null);
		
		System.out.println("Sorted by waaah: " + studentRoster.toString() + "\n");
		System.out.println((new Student(1,0.2, "Harry", "Potter", 20)).compareTo(new Student(2,3.0, "Hermione", "Granger", 25)));
		
		/**
		 * 
		 * Displaying students on studentRoster
		 * 
		 * for(Student o:studentRoster){  
		 *	 System.out.println("\nStudent [id=" + o.id + ", GPA=" + o.gpa + ", first name=" + o.getFirstName() + ", last name=" + 
         *           o.getLastName()	+ ", age=" + o.getAge() + "]");  
		 *	}
		 *	
		 */
		
		System.out.println("\n\n****Student API****\n");
		
		studentRoster.sort(Student::compareByLastName);
		
		System.out.println("Sorted by Last Name: " + studentRoster.toString() + "\n");
		
		studentRoster.sort(Student::compareById);
		System.out.println("Sorted by ID: "+ studentRoster.toString() + "\n");
		
		studentRoster.sort(Student::compareByAge);
		System.out.println("Sorted by Age: " + studentRoster.toString() + "\n");
		
		studentRoster.sort(Student::compareByGPA);
		System.out.println("Sorted by GPA: " + studentRoster.toString() + "\n");
		
		
		studentRoster.sort(Student::compareById);
		/**
		 * Student API's toString() 
		 */
		System.out.println("Student API's Student List toString() \n" + studentRoster.toString());
		
		/**
		 * Person API add and compare methods
		 */
		List<Person> personRoster = new ArrayList<Person>();
		
		personRoster.add(new Student(6, 3.0, "Severus", "Snape", 21));
		personRoster.add(new Student(7, 2.0, "Sirius", "Black", 19));
		personRoster.add(new Student(8, 3.5, "Luna", "Lovegood", 27));
		personRoster.add(new Student(9, 2.7, "Dolores", "Umbridge", 30));
		personRoster.add(new Student(10, 3.9, "Newt", "Scamander", 31));
		
		System.out.println("\n\n****Person API****\n");
		
		personRoster.sort(Student::compareByLastName);
		System.out.println("Sorted by Last Name: " + personRoster.toString() + "\n");
		
		personRoster.sort(Student::compareById);
		System.out.println("Sorted by ID: "+ personRoster.toString() + "\n");
		
		personRoster.sort(Student::compareByAge);
		System.out.println("Sorted by Age: " + personRoster.toString() + "\n");
		
		personRoster.sort(Student::compareByGPA);
		System.out.println("Sorted by GPA: " + personRoster.toString() + "\n");
		
		
		personRoster.sort(Student::compareById);
		/**
		 * Person API's toString() 
		 */
		System.out.println("Person API's Student List toString() \n" + personRoster.toString());
	}

}
