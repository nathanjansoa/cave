package cave.programing;

import java.util.Random;
import java.util.Scanner;

public class TestKnowledge {
	public static void main(String[] args) {
		/*
		 * 1. Create a "Hello World" Java Program
		 * 
		 * Create a basic Java programme that simply outputs the text "Hello World".
		 * 
		 * Hint: you'll need to create a class and give it a 'main' method. Call the
		 * class "Application" (or anything else appropriate).
		 */
		System.out.println("Hello Dan World");
		/*
		 * 2. An Interactive Program
		 * 
		 * Create a program that asks the user to enter an integer. If the integer is
		 * less than 10, print the message "This number is too small". If the integer is
		 * greater than or equal to 10, print "This number is big enough".
		 * 
		 * Hint: use the Scanner class with an if ... else statement.
		 */
		//Scanner scan = new Scanner(System.in);
		System.out.println("Digit a number:");
		//if(scan.nextInt()<10) {
			System.out.println("This number is too small");
		//}else {
			System.out.println("This number is big enough");
		//}
		//scan.close();
		/*
		 *3.  Arrays
		 * 
		 * Create a program that creates an array of five hard-coded floating-point
		 * values, then prints out just the second value.
		 */
		double[] coded = {1.2,2.3,3.4,4.5,5.6};
		System.out.println(coded[1]);
		/*
		 * 4. Arrays and Loops
		 * 
		 * Modify the above program so that it uses a for loop to display all the values
		 * in the array, all on the same line, each value formatted to two decimal
		 * places and followed by a space.
		 * 
		 * Hint: use System.out.printf.
		 */
		for(int i = 0; i <coded.length;i++) {
			System.out.printf("%2f",coded[i]);
		}
		System.out.println("");
		/*
		 * 5. Two Dimensional Arrays
		 * 
		 * A bit trickier, this one. Write an application that creates a two-dimensional
		 * array of Strings, with two rows and three columns. Print the value in the
		 * second row and third column.
		 * 
		 * Hint: you can create an array of strings just like you created an array of
		 * floating point values above, but with text in quotes (e.g. "I'm a string")
		 * instead of floating-point numbers.
		 * 
		 * To define a 2D array, remember that the symbol [] means a 1D array (compare
		 * the answer to the exercise above), while [][] means a 2D array.
		 * 
		 * Also, remember that when you set the values of the array, each of the values
		 * is itself an array!
		 * 
		 * Finally, if this has you smashing plates and climbing the wall, check the
		 * answer, then hide it again and see if you can remember how it works.
		 * 
		 */
		String[][] matrix = {
				{"pata","peta","pita"},
				{"pota","puta","pato"}
		};
		System.out.println(matrix[1][2]);
		/*
		 * 6. Looping Through 2D Arrays
		 * 
		 * Create an application that uses two nested for loops to loop through the 2D
		 * array defined above and print the values.
		 * 
		 * Hint: Here's the outer loop:
		 * The inner loop should use a loop variable called "col" (or whatever you
		 * like) and should loop through the columns.
		 * 
		 * Hard code the number of columns and rows, as above.
		 * 
		 * Once again, this is one of the trickiest beginner's tasks in Java. If you
		 * can't work it out, check the answer, then hide it again and try to write it
		 * from memory.
		 */
		double[][] valr = {{0,0,0},{0,0,0}}; 
		for(int row = 0;row<2;row++) {
			for(int col = 0;col<3;col++) {
				valr[row][col] = row+col+1;
			}
		}
		System.out.println(valr[1][1]);
		/*
		 * 7. Create Classes and Objects
		 * 
		 * First, create a main program as in the first exercise.
		 * 
		 * Next, define a new class in its own file. Call the class Car. Give it a
		 * single method called "start". Make the method simply print "Car started!".
		 * 
		 * In your main program, create a new Car object and call its start() method.
		 * 
		 * Your final program should simply therefore display the text "Car started!".
		 */
		Car car = new Car();
		car.start();
		/*
		 * 8. Constructors
		 * 
		 * Modify the above Car class so that it has an instance variable called name of
		 * type String. Add a constructor that accepts a string parameter and sets the
		 * car's name using this parameter. Add a getName() method that returns the
		 * car's name.
		 * 
		 * Finally, modify the main application so that it sets the car's name via the
		 * constructor, then prints the cars name (retrieving it using getName()).
		 */
		Car car2 = new Car("Clio");
		car2.start();
		System.out.println(car2.getName());
		/*
		 * 9. While Loops
		 * 
		 * Write an application that asks the user to enter the number '5' and loops
		 * over and over until '5' is entered.
		 * 
		 * When 5 is finally entered, print "Got it!".
		 * 
		 * Hint: the application structure will look like this:
		 * 
		 * declare a variable and set it equal to 0 (for example) create a new Scanner
		 * object so that we can use it to get input later on. begin a while loop which
		 * loops until the variable is set equal to 5. ask the user to enter '5' store
		 * the user input in your variable end the while loop print "Got it!"
		 * 
		 * The program will crash if you enter something that isn't a number, but don't
		 * worry about that.
		 */
		int value = 0;
        Scanner scanner = new Scanner(System.in);
        while(value != 5) {
            System.out.println("Enter the number 5: ");
            value = scanner.nextInt();
        }
        System.out.println("Got it!");
		/*
		 * 10. Improved Use of Scanner
		 * 
		 * The above program crashes if a user enters something other than a number. The
		 * problem is that we use the nextInt() method of Scanner, assuming blindly that
		 * we will get an integer.
		 * 
		 * Modify the program so that no input can crash it.
		 * 
		 * Hint: you will need the hasNextInt() method of Scanner. You will also need
		 * the nextLine() method so that you can get a line from the user if they don't
		 * enter an integer.
		 * 
		 * You'll need to use an if...else statement that detects if the user enters an
		 * int, and simply gets a line (rather than an int) if he doesn't. Don't be
		 * afraid to consult the API docs for the Scanner class; type "java api scanner"
		 * into Google (without the quotes).
		 */
        int values = 0;
        while(values != 5) {
            System.out.println("Enter the number 5: ");
            if(scanner.hasNextInt()) {
                values = scanner.nextInt();
            }
            else {
            	scanner.nextLine();
            }
        }
        System.out.println("Got it!");
		/*
		 * 11. Switch Statements
		 * 
		 * Write a program that asks the user to enter an integer. If the user enters
		 * '1', print "Got 1". If the user enters '66', print "Got 66". If the user
		 * enters something other than these two numbers, print "Got something else".
		 * 
		 * The program should use a switch statement.
		 * 
		 * Hint: you may need to look up switch statements on Google. Use the default
		 * clause to implement the case where the user doesn't enter '1' or '66'.
		 */
        int clic;
        Util.textLn("Digite um valor:");
        clic = scanner.nextInt();
        switch (clic) {
		case 1:
			System.out.println("Got 1");
			break;
		case 66:
			System.out.println("Got 66");
			break;

		default:
			System.out.println("Got something else.");
			break;
		}
		/*
		 * 12. Do...While Loops
		 * 
		 * A while loop checks its condition before the first iteration of the loop. A
		 * do...while loop checks the condition at the end of the loop. This means
		 * there's always at least one iteration of the loop.
		 * 
		 * Write a program that asks the user to enter an integer, then gets the input
		 * from the user. The program should repeatedly ask the user to enter an integer
		 * until the user enters an integer greater than 10; then it should print
		 * "Integer greater than 10 detected!" and should end.
		 * 
		 * The program must contain only two print statements!
		 * 
		 * Hint: use a do...while loop to enclose the 'prompt' (i.e. the text that asks
		 * the user to enter the integer) and the bit that gets the user input.
		 */
        int valor = 0;
		do {
			Util.textLn("Digite um valor:");
			valor = scanner.nextInt();
		}while(valor<=10);
		Util.textLn("Integer greater than 10 detected!");
        scanner.close();
	}
}

class Car{
	String name;
	public Car() {
	}
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void start() {
		System.out.println("Car started!");
	}
}