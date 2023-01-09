package edu.neu.csye6200.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtility{

	/*
	 * Method to read from CSV file
	 */
	public static void readFromFile() {
		
	String line = "";  
	String splitBy = ",";  
	try {  
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shwet\\eclipse-workspace\\workspace_2021_12_Shweta_Jose_CSV\\Project1\\src\\edu\\neu\\csye6200\\assignment4\\students.txt"));
	System.out.println("\nStudent information READ from the file: \n");
	  while ((line = br.readLine()) != null){  
	  String[] field = line.split(splitBy);
	  System.out.println("Student [Person ID=" + field[0] + ", Age: " + field[1] + ", First Name: " + field[2] + ", Last Name: "
	    + field[3] + ", Parent's First Name: " + field[4] + ", Parent's Last Name: " + field[5] + ", Student ID: " + field[6] + ", GPA: " + field[7]+ "]"); 
	  } 
	}   
	catch (Exception e){  
	e.printStackTrace();  
	} 

}
	
	
	/*
	 * Method to write onto CSV file
	 */
	public static void writeOnFile(String[] studentInfo) {
		
		try (BufferedWriter out= new BufferedWriter(new FileWriter("C:\\Users\\shwet\\eclipse-workspace\\workspace_2021_12_Shweta_Jose_CSV\\Project1\\src\\edu\\neu\\csye6200\\assignment4\\students.txt"));){
			 
		     for (String student : studentInfo) {
		     out.write(student);
		     out.newLine();
		}
		     out.flush();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	
	public  static List<String> readFile() {
		
		String filename = "C:\\Users\\shwet\\eclipse-workspace\\workspace_2021_12_Shweta_Jose_CSV\\Project1\\src\\edu\\neu\\csye6200\\assignment4\\students.txt";
		List<String> students = new ArrayList<>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			while (line != null) {
				students.add(line);
				line = br.readLine();	
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}	
}