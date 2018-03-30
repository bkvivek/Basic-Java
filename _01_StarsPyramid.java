package programs;

import java.util.Scanner;

public class _01_StarsPyramid {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter Number number of rows: ");
		int numOfRows = in.nextInt();
		in.close();
		int numOfSpaces=numOfRows-1;
		int numOfStars=1;
		while(numOfSpaces>=0) {
			for(int i=0; i<2*numOfSpaces; i++) {
				System.out.print(" ");	// Creates the starting spaces
			}		
			for(int j=0; j<numOfStars; j++) {
				System.out.print("* ");
			}
			System.out.println("");	// To end the present line
			numOfStars+=2;
			numOfSpaces--;
		}
	}

}
