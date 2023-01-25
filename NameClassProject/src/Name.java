//Name: Wesley
//Date: 2022-09-28

import java.util.*;
public class Name {


	//Instance Variables
	String firstName;
	String lastName;
	String title;
	
	//For getting first name
	public void getFirst() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		this.firstName = scanner.nextLine();
	}
	
	//For getting last name
	public void getLast() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your last name: ");
		this.lastName = scanner.nextLine();
	}
	
	//For getting title
	public void getTitle() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your Title: ");
		this.title = scanner.nextLine();
	}
	
	//For getting initials
	public void getInitials() {
		
		System.out.println("Your initials are: " + firstName.substring(0, 1) + lastName.substring(0, 1));
	}
	
	//For changing title
	public void setTitle(String newTitle) {
		
		title = newTitle;
		System.out.print("Your new title is: " + newTitle);
		
	}
	
	
	//For changing the first name
	public void changeFirst() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("What would you like to change your first name to?: ");
		this.firstName = scanner.nextLine();
	}
	
	//For changing the last name
	public void changeLast() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("What would you like to change your last name to?: ");
		this.lastName = scanner.nextLine();
	}
}
