package firstLabs;
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * @author Katie
 * @since 8/30/17
 * @version 1
 */
public class Lab1b {

	// data members

	/**
	 * Constructor: calls method readFile that reads the doubles contained in the
	 * file "<code>filename</code>" and computes the average of the elements.
	 * 
	 * @param filename
	 *            name of the file containing doubles.
	 */
	public Lab1b(String filename) {
		readFile(filename);
	}

	/**
	 * Reads double from a file named <code>filename</code> and computes the average
	 * of the elements contained in the file
	 * 
	 * @param filename
	 *            name of the file containing the doubles
	 */
	int fileLength = 0;
	double total = 0, average, nextNum;
	File inputFile2 = new File("Lab1b.dat");

	/**
	 *Reads all doubles from a file, adds them up and counts the total number of files,
	 *then uses those values to calculate the average value
	 * 
	 * @param filename
	 * 
	 */
	public void readFile(String filename) {
		try {
			Scanner fileScan = new Scanner(inputFile2);
			while (fileScan.hasNextDouble()) {
				nextNum = fileScan.nextDouble();
				fileLength++;
				total += nextNum;
			}
			average = total / fileLength;
			fileScan.close();
		} catch (IOException hehe) {
			System.err.println("whoops there's somethin wrong w the input");
		}

	} // end readFile()

	/**
	 * main : creates a Lab1b Object with the filename passed in argument
	 */
	public static void main(String args[]) {
		if (args.length == 0)
			System.err.println("enter the data file name!");
		else
			new Lab1b(args[0]);
	} // end main

} // end class Lab1b
