// *****************************************************************************
// * Student Name: Mark Land                          Moorpark College         *
// * Program Name: Ch3_PrExercise1.java               CS M10J (Intro Java)     *
// * Comment     : File I~O Basics Program            Intro to Prog using Java *
// *               Programming Exercises              Fall of 2015             *
// *               ch. 3, pg. 171-172, #1             Prof. John C. Reynolds   *
// *****************************************************************************

// Packages~Libraries~Modules:

import java.io.*;
import java.util.*;

// import java.io.FileReader;
// import java.io.PrintWriter;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

/*
I had to trouble shoot a java error: ~ "missing symbol for the
'throw FileNotFoundException' Error", caused by not using the
' import java.io.* '
*/

public class Ch3_PrExercise1
{
	// Constants ~ Variables ~ Object Instantiation:
	
	static final double MY_PI = 3.1416;
	
	public static void main (String[] args) throws FileNotFoundException
	{
		// Header Info Displayment:

		System.out.println("****************************************" +
			"****************************************");
		System.out.println("* Student Name: Mark Land                        " +
			"     Moorpark College         *");
		System.out.println("* Program Name: Ch3_PrExercise1.java" +
			"                  CS M10J (Intro Java)     *");
		System.out.println("* Comment     : File I~O Basics Program" +
			"               Intro to Prog using Java *");
		System.out.println("*               Programming Exercises            " +
			"     Fall of 2015             *");
		System.out.println("*               ch. 3, pg. 171-172, #1" +
			"                Prof. John C. Reynolds   *");
		System.out.println("****************************************" +
			"****************************************\n\n");
		
		// Program's Purpose Displayment:
		
		System.out.println("The purpose of this program is to read (get) \n" +
			"data from the \'inData.txt\' file, temporarily store the data,\n" +
			"do calculations, and save (over-write, or write) the stored and\n"
			+ "new data to~into the already existing (or create a) file \n" +
			"called \'outData.txt\' neatly displayed for the user.\n\n");
		
		// Variable Definitions, Initializations, and Object Instantiations:
		
		char alphabet_letter, following_alphabet_letter;
		double length, width, rectangle_area, perimeter, radius, circumference,
			circle_area, interest_rate, initial_balance, final_balance;
		int age;
		
		String first_name, last_name;
		
		Scanner inFile =
			new Scanner(new FileReader("C:\\Users\\Mark\\Desktop\\inData.txt"));
		PrintWriter outFile =
			new PrintWriter("C:\\Users\\Mark\\Desktop\\outData.txt");
			
		// prompting the user that the 'inData.txt' and 'outData.txt' files are
		// 	(if needed: created and) opened, and are being read by the program:
		
		System.out.println("The \'inData.txt\' and \'outData.txt\' files \n" +
			"have been (if needed: created and) opened, and are being read \n"
			+ "by the program.\n\n");
		
		// reading and temporarily storing the data from the 'inData.txt' file:
		
		length = inFile.nextDouble();
		width = inFile.nextDouble();
		radius = inFile.nextDouble();
		first_name = inFile.next();
		last_name = inFile.next();
		age = inFile.nextInt();
		initial_balance = inFile.nextDouble();
		interest_rate = inFile.nextDouble();
		alphabet_letter = inFile.next().charAt(0);
		
		// close the 'inData.txt' File:
		
		inFile.close();
		
		// prompt the user that the 'inData.txt' file has been closed:
		
		System.out.println("The \'inData.txt\' file's data has been read and \n"
			+ "stored, and the file has been closed.\n\n");
		
		// calculations:
		
		rectangle_area = length * width;
		perimeter = 2 * (length + width);
		circle_area = MY_PI * Math.pow(radius,2);
		circumference = 2 * MY_PI * radius;
		final_balance = initial_balance +
			((initial_balance * (interest_rate / 100)) / 12);
		following_alphabet_letter = (char)((int)(alphabet_letter) + 1);
		
		// write the new data to the 'outData.txt' File neatly for the user:
		
			// Rectangle:
		
		outFile.println("Rectangle:");
		outFile.printf("Length = %.2f, width = %.2f, area = %.2f, " +
			"perimeter = %.2f%n%n", length, width, rectangle_area, perimeter);
		
			// Circle:
		
		outFile.println("Circle:");
		outFile.printf("Radius = %.2f, area = %.2f, circumference = %.2f" +
			"%n%n", radius, circle_area, circumference);
			
			// Name, Age, Interest Balance:
			
		outFile.printf("Name: %s %s, age: %d%nBeginning balance = $%.2f, " +
			"interest rate = %.2f%nBalance at the end of the month = " +
			"$%.2f%n%n", first_name, last_name, age, initial_balance,
			interest_rate, final_balance);
			
			// Alphabet Letters (Character Data Type):
			
		outFile.printf("The characer that comes after %c in the ASCII set " +
			"is %c%n%n%n", alphabet_letter, following_alphabet_letter);
		
		// close the 'outData.txt' File:
		
		outFile.close();
		
		// prompt the user that the stored data has used for calculations and
		//		written (or over_writtened) to the 'outData.txt' file, and that
		//		the file has been closed, and the path location of the file:
		
		System.out.println("The new data has been written to the \n" +
			"\'outData.txt\' file, and the file has been closed.\n\n");
			
		System.out.println("The \'outData.txt\' File can be found at the \n" +
			"path location of: \"C:\\Users\\Mark\\Desktop\"\n\n");
	}
}
