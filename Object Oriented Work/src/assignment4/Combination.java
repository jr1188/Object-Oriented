package assignment4;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {

		int max = 9;
		int min = 0;
		
		int secretNumberHundreds = (int)(Math.random() * ((max - min) + 1)) + min;
		int secretNumberTens = (int)(Math.random() * ((max - min) + 1)) + min;
		int secretNumberOnes = (int)(Math.random() * ((max - min) + 1)) + min;

		
		Scanner sc = new Scanner(System.in);
		
		int ones;
		int tens;
		int hundreds;
		
		
		boolean rightGuess = false;
		
		int counter = 0;
		
		while (rightGuess != true) {
			System.out.println("Enter your guess: ");
			
			int number;
			
			try {
				number = Integer.parseInt(sc.nextLine());
			} 
			catch (Exception e) {
				System.out.println("That is not a number");
				continue;
			}
			
			if (number < 0) {
				System.out.println("You must enter a positive number.");
				continue;
			}
			
			if (number < 99) {
				System.out.println("Please enter a three digit number.");
				continue;
			}
			
			ones = number % 10;
			tens = (number / 10) % 10;
			hundreds = (number / 100) % 10;
			
			if( ones == secretNumberOnes && tens == secretNumberTens && hundreds == secretNumberHundreds) {
				System.out.println("Congratulations! You guessed correct! :)");
				System.out.println("It took you " + counter + " guesses to find the secret number");
				return;
			}
			
			boolean onesGuess = false;
			boolean tensGuess = false;
			boolean hundredsGuess = false;
			
			counter++;
			
			if (hundreds > secretNumberHundreds) {
				System.out.println("The first digit is too high!");
			} 
			else if (hundreds < secretNumberHundreds) {
				System.out.println("The first digit is too low!");
			}
			else {
				System.out.println("The first digit is correct!");
			}
			
			if (tens > secretNumberTens) {
				System.out.println("The second digit is too high!");
			} 
			else if (tens < secretNumberTens) {
				System.out.println("The second digit is too low!");
			}
			else {
				System.out.println("The second digit is correct!");
			}
			
			if (ones > secretNumberOnes) {
				System.out.println("The third digit is too high!");
			} 
			else if (ones < secretNumberOnes) {
				System.out.println("The third digit is too low!");
			}
			else {
				System.out.println("The third digit is correct!");
			}
		
			}
		}
		
		
	}


