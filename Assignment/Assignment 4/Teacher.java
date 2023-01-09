package edu.neu.csye6200.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

	private double hourlyWage;

	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int iD, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
		super(iD, age, firstName, lastName, parentFirstName, parentLastName);
		// TODO Auto-generated constructor stub
	}


	public Teacher(double hourlyWage) {
		super();
		this.hourlyWage = hourlyWage;
	}

	
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	@Override
	public String toString() {
		return "HourlyWage: "+ this.hourlyWage+", ID: "+ this.getiD()+" Age: "+this.getAge()+", First Name: "+ this.getFirstName()+
				", Last Name: "+ this.getLastName()+", Parent's First Name: "+ this.getParentFirstName()+", Parent's Last Name: "+ this.getParentLastName();
	
	}
	
	public static void demo() {
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher(1000,8,"Paula","Scott","Paulina","Scott"));
		teachers.add(new Teacher(1500,9,"Reena","Raj","Riya","Raj"));
		teachers.add(new Teacher(2000,10,"Lilly","Ferris","Daisy","Ferris"));
		
		
		System.out.println("\n\nTeachers' Data displayed using its toString: ");
		
		for(Teacher teacher : teachers) {
			System.out.println("\n"+ teacher);
		}
		
	}
	
}
