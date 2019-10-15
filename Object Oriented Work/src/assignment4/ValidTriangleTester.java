package assignment4;

import java.util.Scanner;

public class ValidTriangleTester {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of side #1: ");
		int length1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the size of side #2: ");
		int length2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the size of side #3: ");
		int length3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		System.out.println("The length of each side of your test shape is");
		System.out.println("");
		System.out.println("Side 1: " + length1);
		System.out.println("Side 2: " + length2);
		System.out.println("Side 3: " + length3);
		System.out.println("");
		
		if ( ((length1+length2) > length3) && ((length2+length3) > length1) && ((length1+length3) > length2)) {
			System.out.println("This is a valid triangle!");
			if (length1 == length2 && length1 == length3) {
				System.out.println("This is a equilateral triangle.");
			}
			else if (length1 == length2 || length1 == length3 || length2 == length3) {
				System.out.println("This is a isosceles triangle.");
			}
			else {
				System.out.println("This is a scalene Triangle.");
			}
				
		}
		else {
			System.out.println("This is not a valid triangle!");
		}


	}
}
