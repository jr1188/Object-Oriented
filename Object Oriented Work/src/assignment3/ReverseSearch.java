package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSearch {

	//C:\Users\jr1188\Documents\GitHub\Object-Oriented\Object Oriented Work\src\assignment3\Numbers
	
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file location: ");
		String fileName = sc.nextLine();
		System.out.print("Please enter a value to be searched for: ");
		int query = Integer.parseInt(sc.nextLine());
		
		
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		String line;
		
		System.out.println("Searching...");
		
		ArrayList<Integer> values = new ArrayList<>();

		while ((line = br.readLine()) != null) {

			values.add(Integer.parseInt(line));

		}
		
		for (int x = values.size() -1; x >= 0; x--) {
			int temp = values.get(x);
			if (temp == query) {
				System.out.println("Found! The last index of the value " + query + " is at index " + x + ".");
				return;
			}
			
		}
		System.out.println("Not found! Exiting with error code: -1.");
		
}
	
	
}
