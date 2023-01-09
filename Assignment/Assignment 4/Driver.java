package edu.neu.csye6200.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
	
		Student.demo();
		
		Teacher.demo();
		
		//To do the comparison
		Student s = new Student();
		List<Student> studentRoster = s.rosterFromStudentsFile();
		s.sortStudents(studentRoster);
		
		
		
		
		
/*
 * 
writeOnFile() method called to WRITE Student information into the file called students.txt 


Student information READ from the file: 

Student [Person ID=1, Age: 30, First Name: Sam, Last Name: Kim, Parent's First Name: Kim, Parent's Last Name: Kimmy, Student ID: 4, GPA: 3]
Student [Person ID=2, Age: 21, First Name: Jam, Last Name: Jim, Parent's First Name: Jim, Parent's Last Name: Jimmy, Student ID: 2, GPA: 2]
Student [Person ID=3, Age: 25, First Name: Clam, Last Name: Wim, Parent's First Name: Wim, Parent's Last Name: Wimmy, Student ID: 3, GPA: 3.6]
Student [Person ID=4, Age: 23, First Name: Tam, Last Name: Tim, Parent's First Name: Tim, Parent's Last Name: Timmy, Student ID: 1, GPA: 3.7]


Students' Data displayed using its toString: 
[
Student [Person ID=1, Age: 30, First Name: Sam, Last Name: Kim, Parent's First Name: Kim, Parent's Last Name: Kimmy, Student ID: 4, GPA: 3.0]
, 
Student [Person ID=2, Age: 21, First Name: Jam, Last Name: Jim, Parent's First Name: Jim, Parent's Last Name: Jimmy, Student ID: 2, GPA: 2.0]
, 
Student [Person ID=3, Age: 25, First Name: Clam, Last Name: Wim, Parent's First Name: Wim, Parent's Last Name: Wimmy, Student ID: 3, GPA: 3.6]
, 
Student [Person ID=4, Age: 23, First Name: Tam, Last Name: Tim, Parent's First Name: Tim, Parent's Last Name: Timmy, Student ID: 1, GPA: 3.7]
]


Teachers' Data displayed using its toString: 

HourlyWage: 0.0, ID: 1000 Age: 8, First Name: Paula, Last Name: Scott, Parent's First Name: Paulina, Parent's Last Name: Scott

HourlyWage: 0.0, ID: 1500 Age: 9, First Name: Reena, Last Name: Raj, Parent's First Name: Riya, Parent's Last Name: Raj

HourlyWage: 0.0, ID: 2000 Age: 10, First Name: Lilly, Last Name: Ferris, Parent's First Name: Daisy, Parent's Last Name: Ferris


Sorted by Age: 

Student [Person ID=2, Age: 21, First Name: Jam, Last Name: Jim, Parent's First Name: Jim, Parent's Last Name: Jimmy, Student ID: 2, GPA: 2.0]


Student [Person ID=4, Age: 23, First Name: Tam, Last Name: Tim, Parent's First Name: Tim, Parent's Last Name: Timmy, Student ID: 1, GPA: 3.7]


Student [Person ID=3, Age: 25, First Name: Clam, Last Name: Wim, Parent's First Name: Wim, Parent's Last Name: Wimmy, Student ID: 3, GPA: 3.6]


Student [Person ID=1, Age: 30, First Name: Sam, Last Name: Kim, Parent's First Name: Kim, Parent's Last Name: Kimmy, Student ID: 4, GPA: 3.0]




Sorted by First Name: 

Student [Person ID=3, Age: 25, First Name: Clam, Last Name: Wim, Parent's First Name: Wim, Parent's Last Name: Wimmy, Student ID: 3, GPA: 3.6]


Student [Person ID=2, Age: 21, First Name: Jam, Last Name: Jim, Parent's First Name: Jim, Parent's Last Name: Jimmy, Student ID: 2, GPA: 2.0]


Student [Person ID=1, Age: 30, First Name: Sam, Last Name: Kim, Parent's First Name: Kim, Parent's Last Name: Kimmy, Student ID: 4, GPA: 3.0]


Student [Person ID=4, Age: 23, First Name: Tam, Last Name: Tim, Parent's First Name: Tim, Parent's Last Name: Timmy, Student ID: 1, GPA: 3.7]




Sorted by Last Name: 

Student [Person ID=2, Age: 21, First Name: Jam, Last Name: Jim, Parent's First Name: Jim, Parent's Last Name: Jimmy, Student ID: 2, GPA: 2.0]


Student [Person ID=1, Age: 30, First Name: Sam, Last Name: Kim, Parent's First Name: Kim, Parent's Last Name: Kimmy, Student ID: 4, GPA: 3.0]


Student [Person ID=4, Age: 23, First Name: Tam, Last Name: Tim, Parent's First Name: Tim, Parent's Last Name: Timmy, Student ID: 1, GPA: 3.7]


Student [Person ID=3, Age: 25, First Name: Clam, Last Name: Wim, Parent's First Name: Wim, Parent's Last Name: Wimmy, Student ID: 3, GPA: 3.6]




Sorted by Student ID: 

Student [Person ID=4, Age: 23, First Name: Tam, Last Name: Tim, Parent's First Name: Tim, Parent's Last Name: Timmy, Student ID: 1, GPA: 3.7]


Student [Person ID=2, Age: 21, First Name: Jam, Last Name: Jim, Parent's First Name: Jim, Parent's Last Name: Jimmy, Student ID: 2, GPA: 2.0]


Student [Person ID=3, Age: 25, First Name: Clam, Last Name: Wim, Parent's First Name: Wim, Parent's Last Name: Wimmy, Student ID: 3, GPA: 3.6]


Student [Person ID=1, Age: 30, First Name: Sam, Last Name: Kim, Parent's First Name: Kim, Parent's Last Name: Kimmy, Student ID: 4, GPA: 3.0]




Sorted by GPA: 

Student [Person ID=2, Age: 21, First Name: Jam, Last Name: Jim, Parent's First Name: Jim, Parent's Last Name: Jimmy, Student ID: 2, GPA: 2.0]


Student [Person ID=1, Age: 30, First Name: Sam, Last Name: Kim, Parent's First Name: Kim, Parent's Last Name: Kimmy, Student ID: 4, GPA: 3.0]


Student [Person ID=3, Age: 25, First Name: Clam, Last Name: Wim, Parent's First Name: Wim, Parent's Last Name: Wimmy, Student ID: 3, GPA: 3.6]


Student [Person ID=4, Age: 23, First Name: Tam, Last Name: Tim, Parent's First Name: Tim, Parent's Last Name: Timmy, Student ID: 1, GPA: 3.7]



 */
	}

}