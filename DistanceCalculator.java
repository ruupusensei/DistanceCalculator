import java.util.Scanner;

public class DistanceCalculator {

	Scanner input = new Scanner(System.in);
		
	public DistanceCalculator() {
	}

	/**
	 * This method uses the the built in Java Scanner utility to allow users to input their own set of Point3D objects.
	 * 
	 * @return Point3D	the object in which user's input is stored
	 */
	
	public Point3D inputPoint() {
		
		double x;
		double y;
		double z;
		
		System.out.println("Please enter the X coordinate of your point.");
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input, please enter a number.");
			input.next();
		}
		 x = input.nextDouble();
		
		 System.out.println("Please enter the Y coordinate of your point.");
		 	while (!input.hasNextDouble()) {
		 		System.out.println("Invalid input, please enter a number.");
		 		input.next();
			}
		 y = input.nextDouble();
			
		 System.out.println("Please enter the Z coordinate of your point.");
			while (!input.hasNextDouble()) {
				System.out.println("Invalid input, please enter a number.");
				input.next();
			}
		z = input.nextDouble();
		
		Point3D newPoint3D = new Point3D(x, y, z);
		
		System.out.println("The point you have created is " + newPoint3D.toString() );
		
		return new Point3D(x, y, z);		
	}
	
	/**
	 * The main method contains a function that was not written as a method for this project. 
	 * The loop which begins on line 84 iteratively calculates the distance between each Point3D object entered by the user. 
	 * During each iteration the loop adds the distance to the distance variable, which after the loop concludes is printed to the screen. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		MySinglyLinkedList<Point3D> myList = new MySinglyLinkedList<Point3D>();
		DistanceCalculator calc = new DistanceCalculator();
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many 3D Points would you like to create?");
		while (!input.hasNextInt()) {
			System.out.println("Invalid input, please enter an integer.");
			input.next();
		}
		int numOfPoints = input.nextInt();
		
		System.out.println("Let's create " + numOfPoints + " points in 3D space.");
	
		int j = 0;
		
		while (j < numOfPoints) {
			myList.add(calc.inputPoint());
			j++;
		}
		
		System.out.println();
		myList.listAll();
		
		double distance = 0;
		
		for (int i = 0; i < myList.size() - 1; i++) {
			distance += myList.get(i).distanceTo(myList.get(i + 1)); 
		}
		
		System.out.println("Now, let's calculate total distance between them...");
		System.out.println("Total distance: " + distance);		
		input.close();
	}

}
