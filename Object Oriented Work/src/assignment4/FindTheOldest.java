package assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTheOldest {

	public static void main(String[] args) throws IOException {
		// Write a program that reads a filename from the console
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the file to read: ");
		
		String filename = sc.nextLine();
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		//The program then opens and reads the file, which contains a name and a number on each line, separated by a
		// space. The program should store the information on each line into a HashMap
		
		Map<String,Integer> map = new HashMap();
		
		String line;
		
		while ((line = br.readLine()) != null) {
			String [] splitNames = line.split(" ");
			map.put(splitNames[0], Integer.parseInt(splitNames[1]));
		}
		
		//At the end, the program prints out the key with the largest value.
		
		int largestValue = -1;
		String largestValueKey = "";
		
		for (String key : map.keySet()) {
			int tempValue = map.get(key);
			if (tempValue > largestValue) {
				largestValue = tempValue;
				largestValueKey = key;
			}
		}
		System.out.print(largestValueKey);

	}

}
