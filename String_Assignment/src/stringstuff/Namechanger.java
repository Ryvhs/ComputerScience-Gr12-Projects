//Name: Wesley
//Date: 2022-09-27
//Description: Prints the total number of capitals that appear in a string
package stringstuff;

import java.util.*;

import java.util.Scanner;

public class Namechanger {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Creates a scanner 

		System.out.print("Enter your first name?");
		String First = scanner.nextLine();  //Scanner reads the next line after question
		System.out.print("Enter your Last name?");
		String Last = scanner.nextLine(); //Scanner reads the next line after question
		
		int total = First.length() + Last.length(); //gets the length of the strings and adds them together 
		
		System.out.println("There are " + First.length() + " letters in your first name and " + Last.length() + " in your last. There is a total of " + total); //prints the amount of letters in the first name, last name, and the total amount
		System.out.println("Your name in uppercase is : " + First.toUpperCase()); // prints the name in upper case characters
		System.out.println("Your name in lowercase is : " + Last.toLowerCase());  // prints the name in lower case letters
		
		String stringName = First.concat(Last);  // connects both the first and lass name to create a concat name
		System.out.println("The concat name is : " + stringName);
		
		StringBuilder rev = new StringBuilder(Last);  // reverses the string and prints the last name backwards
		System.out.println("Your last name Backwards is : " + rev.reverse().toString());
		
		
		
	}

}
