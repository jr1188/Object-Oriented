package assignment2;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String lastName;
	public String firstName;
	private double mathGrade; 
	private double englishGrade;
	private double chemistryGrade;
	private int classType;
	private double newGrade;
	
	public ArrayList<Double> Courses;
	
	// Constructor// syntax: [access modifier] ClassName(...) { ... }
	public Student(int id, String fname, String lname ) {
		studentID = id;
		firstName = fname;
		lastName = lname;
		}
	// Overloaded Constructor
	// Overloaded means having a method with same name
	// but different number or type of parameters
	public Student(int id, String fname, String lname, ArrayList<Double> N) {
		this(id, fname, lname);
		
		this.mathGrade = N.get(1);
		this.englishGrade = N.get(2);
		this.chemistryGrade = N.get(3);
		}
	
	public double computeAverage() {
		double total = 0.0;
		
		for (int i = 0; i < Courses.size(); i++) {
			total += Courses.get(i); 
		}
		
		double avg = (total) / Courses.size();
		return avg;
		}
	
	public void setGrade(int classType, double newGrade) {
		Courses.set(classType,newGrade);
		
	}
	
	// Getters get information from attributes in a Class
	public int getStudentID() {
		return studentID;
		}
	
	}























