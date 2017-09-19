package firstLabs;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SeatName {
	private String[][] seats;
	private String[] seatsZero = new String[100];

	/**
	 * @param args
	 */

	// the output!!
	public void makeArray() {
		try {
			// file it reads from
			File file = new File("C:\\Users\\Katie\\names.dat");
			Scanner namesReader = new Scanner(file);
			int numKids = 0;
			// counts total number of kids in the names.dat file
			while (namesReader.hasNext()) {
				seatsZero[numKids] = namesReader.nextLine();
				numKids++;
			}
			// finds the approx. correct amount of rows and columns for the number of kids
			int rows = (int) Math.sqrt(numKids) + 1;
			int cols = numKids / rows;
			// creates the array
			seats = new String[rows][cols];
			// assigns each entry in the array with the next name
			int z = 0; // variable to iterate through the entries in seatsZero
			for (int i = 0; i <= numKids; i++) {
				for (int j = 0; j <= cols; j++) {
					seats[i][j] = seatsZero[z];
				}
			}
			namesReader.close();
		}

		catch (FileNotFoundException e) {
			System.err.println("file not found");
		}
	}

	public boolean askSeat() {
		
			Scanner whichSeat = new Scanner(System.in);

			System.out.println("which seat? format as (row #)(space)(column #) or enter q to quit");
			if (whichSeat.next() == "q") {
				whichSeat.close();
				return false;
			} else {
				try {
				int r = whichSeat.nextInt();
				int c = whichSeat.nextInt();

				String name = seats[r][c];

				if (name.equals("")) { // a.k.a. if the seat is empty/hasn't been
					System.out.println("seat 4,2 is empty");
				} else {
					System.out.println("The student at seat 4,2 is " + name);
				}
				}
				catch (NullPointerException n) {
					System.out.println("That's not a valid index in the seating chart, try again");
				}
				whichSeat.close();
				return true;
			}
		
	}

	public static void main(String[] args) {
		SeatName app = new SeatName();
		app.makeArray();
		while (app.askSeat())
			;
	}

}
