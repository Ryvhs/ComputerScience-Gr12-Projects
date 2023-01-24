//Name: Wesley
//Date: 2022-09-27
//Description: Prints the total number of capitals that appear in a string
package rectangleClass;
import java.awt.*;
public class RecProject {

	public static void main(String[] args) {
		
		Rectangle[] rectarray = new Rectangle [5]; // creates a rectangle array of length 5 
		rectarray[0] = new Rectangle(2,5,10,10); // creates new rectangles for each index of the array
		rectarray[1] = new Rectangle(3,3,0,0);
		rectarray[2] = new Rectangle(0,0);
		rectarray[3] = new Rectangle(3,8);
		rectarray[4] = new Rectangle(8,3,4,4);
		
		int count = 0; //creates a count variable for the amount of squares
		
		for (int i = 0; i < rectarray.length; i++) { // creates a for loop
		
			System.out.println(rectarray[i].toString()); // prints out the dimensions of the rectangle in string form
			
			
			if (rectarray[i].isEmpty() == false) { // when one of the indexes of the array is empty (when all points are zero) it will print out the required line if they are not empty it does nothing
				
			} else {
				System.out.println("^ This Rectangle is empty ^");
			}
			
			// if all the dimensions are 0 this is considered empty so it takes one away from the count because it is not a square
			if (rectarray[i].getX() == 0 && rectarray[i].getY() == 0 && rectarray[i].getWidth() == 0 && rectarray[i].getHeight() == 0) { 
				count = count -1;
			}
			
			// if the width and height of the rectangle are the same it adds one to the count (count is the amount of squares)
			if (rectarray[i].getWidth() == rectarray[i].getHeight()) {
				count = count +1;
				

			}
		}
		
		System.out.println(count + " Rectangles are Squares");
	
	
		
		
		
		
		
		
		
	}

}
