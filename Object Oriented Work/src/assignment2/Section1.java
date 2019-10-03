package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Section1 {

public static void main (String[] args) {
	 BufferedReader br = null;
	 FileReader fr = null;
	 try {
		 String fileName;
		 Scanner sc1 = new Scanner(System.in);		 
		 fileName = sc1.nextLine();
		 fr = new FileReader(fileName);
		 br = new BufferedReader(fr);
		 String line;
		 
	 while ((line = br.readLine()) != null) {
	 System.out.println(line);
	 }
	 fr.close();
	 br.close();
	 sc1.close();
	 }
	 catch (Exception e) {
		 System.out.print(e.getMessage());
		 }
	 }
}
	 



