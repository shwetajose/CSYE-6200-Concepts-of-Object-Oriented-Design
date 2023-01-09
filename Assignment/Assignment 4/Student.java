package edu.neu.csye6200.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student extends Person implements Comparable<Student>{

	private int studentID;
	private double gpa;
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int iD,int age, String firstName, String lastName, String parentFirstName, String parentLastName,int studentID,double gpa) {
		setiD(iD);
		setAge(age);
		setFirstName(firstName);
		setLastName(lastName);
		setParentFirstName(parentFirstName);
		setParentLastName(parentLastName);
		this.studentID = studentID;
		this.gpa = gpa;
	}
 
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	@Override
	public String toString() {
		//return "Student [studentID=" + studentID + ", gpa=" + gpa + "]";
		return "\nStudent [Person ID=" + getiD() + ", Age: " + getAge() + ", First Name: " + getFirstName() + ", Last Name: "
	    + getLastName() + ", Parent's First Name: " + getParentFirstName() + ", Parent's Last Name: " + getParentLastName() + ", Student ID: " + getStudentID() + ", GPA: " + getGpa()+ "]\n";
	}
	
	
	@Override
	public int compareTo(Student o) {
		if(studentID==o.studentID)  
			return 0;  
		else if(studentID>o.studentID)  
			return 1;  
		else  
			return -1;
	}
	
	
	public static int compareById(Student s1, Student s2) {
		 return Integer.compare(s1.getiD(), s2.getiD());
	}
	
	public static int compareByAge(Student s1 , Student s2) {
		return Integer.compare(s1.getAge(), s2.getAge());
	}
	
	public static int compareByFirstName(Student s1 , Student s2) {
		return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
	}
	
	public static int compareByLastName(Student s1 , Student s2) {
		return s1.getLastName().compareToIgnoreCase(s2.getLastName());
	}

	public static int compareByStudentId(Student s1, Student s2) { 
		 return Double.compare(s1.getStudentID(), s2.getStudentID());
	}
	
	public static int compareByGPA(Student s1, Student s2) { 
		 return Double.compare(s1.getGpa(), s2.getGpa());
	}
	
	List<Student> students = new ArrayList<Student>();
	
	
	public static void demo() {
		
		FileUtility f = new FileUtility();
		
		String[] studentInfo = {"1,30,Sam,Kim,Kim,Kimmy,4,3",
                                "2,21,Jam,Jim,Jim,Jimmy,2,2",
                                "3,25,Clam,Wim,Wim,Wimmy,3,3.6",
                                "4,23,Tam,Tim,Tim,Timmy,1,3.7"};
		System.out.println("\nwriteOnFile() method called to WRITE Student information into the file called students.txt \n");
		f.writeOnFile(studentInfo);
		
		
		//readFromFile() method called to READ Student information from the file called students.txt \n");
		f.readFromFile();
		
		
		List<Student> students = new ArrayList<Student>();
		
		try (BufferedReader inLine = new BufferedReader(new FileReader("C:\\Users\\shwet\\eclipse-workspace\\workspace_2021_12_Shweta_Jose_CSV\\Project1\\src\\edu\\neu\\csye6200\\assignment4\\students.txt"));)
		{
		String inputLine = null; 
		while ((inputLine = inLine.readLine()) != null) {
		
		String[] fields = inputLine.split(",");
		int iD = Integer.parseInt(fields[0]);
		int age = Integer.parseInt(fields[1]);
		String fname = fields[2];
		String lname = fields[3];
		String parentFname = fields[4];
		String parentLname = fields[5];
		int studentID = Integer.parseInt(fields[6]);
		double gpa = Double.parseDouble(fields[7]);
		
		students.add(new Student (iD,age,fname,lname,parentFname,parentLname,studentID,gpa));}
		} catch (Exception e) {
		
		e.printStackTrace();
		}
		
		
		System.out.println("\n\nStudents' Data displayed using its toString: ");
		System.out.println(students.toString());
		
}
	
    
	public List<Student> rosterFromStudentsFile() {
		//Reading from students.txt file to be able to compare
		FileUtility readff = new FileUtility();
		List<String> data = readff.readFile();
		for(String line : data){
			String[] field = line.split(",");
			int iD = Integer.parseInt(field[0]);
			int age = Integer.parseInt(field[1]);
			String firstName = field[2];
			String lastName = field[3];
			String parentFirstName = field[4];
			String parentLastName = field[5];
			int studnetID = Integer.parseInt(field[6]);
			double gpa = Double.parseDouble(field[7]);
			
			Student studentRoster = new Student(iD, age, firstName, lastName, parentFirstName, parentLastName,studnetID,gpa);
			students.add(studentRoster);
			
		}
		return students;
	}
	
	
	    public void sortStudents(List<Student> studentRoster) {
		Collections.sort(studentRoster);
		
		studentRoster.sort(Student::compareById);
		
		studentRoster.sort(Student::compareByAge);
		System.out.println("\n\n" + "Sorted by Age: ");
		print(studentRoster);
		
		studentRoster.sort(Student::compareByFirstName);
		System.out.println("\n\n" + "Sorted by First Name: ");
		print(studentRoster);
		
		studentRoster.sort(Student::compareByLastName);
		System.out.println("\n\n" + "Sorted by Last Name: ");
		print(studentRoster);
		
		studentRoster.sort(Student::compareByStudentId);
		System.out.println("\n\n" + "Sorted by Student ID: ");
		print(studentRoster);
		
		studentRoster.sort(Student::compareByGPA);
		System.out.println("\n\n" + "Sorted by GPA: ");
		print(studentRoster);
		
		
}
	
	public void print(List<Student> students) {
		// TODO Auto-generated method stub
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}
	
}
