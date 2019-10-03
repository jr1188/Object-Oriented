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
		System.out.print("File path:");
		String fileName = sc.nextLine();
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		
		ArrayList<Student> students = new ArrayList<>();
		
		while ((line = br.readLine()) != null) {
			
			String firstName = br.readLine();
			String lastName = br.readLine();
			String grades = br.readLine();
			String space = br.readLine();
			
			Student r = new Student(Integer.parseInt(line),firstName,lastName);
			
			//C:\Users\johan\Documents\GitHub\Object-Oriented\Object Oriented Work\src\assignment2\students.txt
			
			String [] splitGrades = grades.split(" ");
			for (int i = 0; i< splitGrades.length; i++) {
				r.addGrade(Integer.parseInt(splitGrades[i]));
			}
			
			
			students.add(r);	
		}
		
		for (int i = 0; i < students.size(); i++) {
			double avg = students.get(i).computeAverage();
			System.out.println("ID: " + i + ", Average: " + avg);
		}
		
	
	}

}
