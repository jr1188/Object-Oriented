package assignment2;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String lastName;
	public String firstName;
	ArrayList<Double> grades = new ArrayList<>();
	// Constructor
	// syntax: [access modifier] ClassName(...) { ... }
	public Student(int id, String fname, String lname) {
		studentID = id;
		firstName = fname;
		lastName = lname;
		}
	// TODO
	public double computeAverage() {
		
		double avg = 0.0;
		for (int i=0; i < grades.size(); i++) {
			avg += grades.get(i);
		}
		avg = avg / grades.size();
		return avg;
		}
	public void addGrade(double grade) {
		grades.add(grade);
		}
	public int getStudentID() {
		return this.studentID;
		}
	}
	























