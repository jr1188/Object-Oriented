package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {
	
	//C:\Users\johan\Documents\GitHub\Object-Oriented\Object Oriented Work\src\assignment3\Untitled 3
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file location: ");
		String fileName = sc.nextLine();
		
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		String line;
		
		System.out.println("Looking for Second Largest...");
		
		ArrayList<Integer> values = new ArrayList<>();

		while ((line = br.readLine()) != null) {

			values.add(Integer.parseInt(line));

		}
		
		if (values.size() < 2) {
			System.out.println (Integer.MIN_VALUE);
			return;
		}
		
		int largest = values.get(0);
		int secondLargest = values.get(0);
		int indexofSecondLargest = 0;
		
		for (int x = 1 ; x < values.size(); x++) {

			if (values.get(x) > largest) {
				secondLargest = largest;
				largest = values.get(x);
				indexofSecondLargest = values.indexOf(secondLargest);
			}
			if ((values.get(x) > secondLargest) && (values.get(x) < largest)) {
				secondLargest = values.get(x);
				indexofSecondLargest = x;
			}
			
		}
		System.out.println("The second largest value is " + secondLargest + " at index " + indexofSecondLargest + ".");
		
}
}
