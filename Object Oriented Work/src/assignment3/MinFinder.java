package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MinFinder {
	
	//C:\Users\jr1188\Documents\GitHub\Object-Oriented\Object Oriented Work\src\assignment3\Untitled 2
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file location: ");
		String fileName = sc.nextLine();
		
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		String line;
		
		System.out.println("Searching...");
		
		ArrayList<Integer> values = new ArrayList<>();

		while ((line = br.readLine()) != null) {

			values.add(Integer.parseInt(line));

		}
		
		if (values.size() == 0) {
			System.out.println (Integer.MAX_VALUE);
			return;
		}
		
		int lowestValue = values.get(0);
		int indexOfLowestValue = 0;
		
		for (int x = 1 ; x < values.size(); x++) {

			if (values.get(x) < lowestValue) {
				lowestValue = values.get(x);
				indexOfLowestValue = x;
			}
			
		}
		System.out.println("The minimum value is " + lowestValue + " at index " + indexOfLowestValue + ".");
		
}
}
