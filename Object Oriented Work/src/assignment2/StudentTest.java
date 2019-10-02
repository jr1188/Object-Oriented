package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) throws IOException {
		// read the file path to the file using Scanner
		// read the students file using BufferedReader
		Scanner sc = new Scanner(System.in);
		System.out.println("File path:");
		String fileName = sc.nextLine();
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		ArrayList<Student> students = new ArrayList<>();
		
		while ((line = br.readLine()) != null) {
			String firstName = br.readLine();
			String lastName = br.readLine();
			String grades = br.readLine();
			
			Student r = new Student(Integer.parseInt(line),firstName,lastName);
			
			String [] splitGrades = grades.split(" ");
			for (int i = 0; i< splitGrades.length; i++) {
				r.addGrade(Integer.parseInt(splitGrades[i]));
			}
			
			String space = br.readLine();
			
			
		}
		
		
		/*
		 * File Format:
		 * studentID
		 * firstName
		 * lastName
		 * grades
		 * 
		 * studentID2
		 * firstName2
		 * lastName2
		 * grades2
		 * 
		 * ...
		 * ArrayList<Student> students = new ArrayList<>();
		 *  while ((line != br.readLine()) != null) {
				// line refers to studentID
				// br.readLine() -> firstName
				// br.readLine() -> lastName
				// br.readLine() -> grades
				// br.readLine() -> ""
				 * 
				// use information to make a new instance of a student class
				// parse grades and store it inside the new instance of student
				// add new student to a list of students
		 	}
		 	
		 	// loop through list of students
		 	// and for each student print out their ID and average on a single line
		*/
	}

}
