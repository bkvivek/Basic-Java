package programs;

import java.util.Scanner;

public class _02_ArraysLeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of integers: ");
		int numOfIntegers = in.nextInt();
		System.out.println("Enter the number of left rotations: ");
		int numOfRotations = in.nextInt();
		int a[] = new int[numOfIntegers];
		System.out.println("Enter the integers: ");
		for(int a_i=0; a_i < numOfIntegers; a_i++){
			a[a_i] = in.nextInt();
		}
		in.close();
		for(int i=0; i < numOfRotations; i++){
			int temp = a[0];
			for(int j=0; j<numOfIntegers-1; j++){
				a[j] = a[j+1];
			}
			a[numOfIntegers-1]=temp;
		}
		System.out.println("Integers after "+numOfRotations+" rotations are: ");
		for(int i=0; i<numOfIntegers; i++){
			System.out.print(a[i]+" ");
		}
	}

}
