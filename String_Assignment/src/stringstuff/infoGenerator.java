//Name: Wesley
//Date: 2022-09-27
//Description: Prints the total number of capitals that appear in a string
package stringstuff;

import java.util.*;

public class infoGenerator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);  // creates a scanner

		System.out.print("What is your first name?"); 
		String First = scanner.nextLine(); // creates a variable connected to the line read which is the first name
		System.out.print("What is your Last name?");
		String Last = scanner.nextLine();  // creates a variable connected to the line read which is the last name
		System.out.print("What is your Student Number?");
		String number = scanner.nextLine(); // creates a variable connected to the line read which is a student number similar to the ones at medway ( 9 digits )
		
		String username = Last.substring(0,3) + First.substring(0,3) + number.substring(6,9); //gets the substrings of each part of the requested username and adds them together to create the username
		String email = First.substring(0,1) + Last + "@medway.com"; //creates the email by adding the information together
		
		System.out.println(); 
		
		System.out.println("__________Welcome " + First + "!__________");
		System.out.println("Your new Username is : " + username);
		System.out.println("Your new email is : " + email);
	}

}
