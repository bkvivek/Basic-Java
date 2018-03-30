package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class _06_ZerosAtTheEnd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Enter the size of the Array: ");
		int arraySize = in.nextInt();
		System.out.println("Enter the Array elements: ");
		for(int i=0; i<arraySize; i++) {
			arrayList.add(in.nextInt());
		}
		System.out.println("ArrayList before moving the zeros to the end:");
		System.out.println(arrayList);
		in.close();
		int zeroCount = 0;
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(0)) {
				iterator.remove();	// Removes all zeros from the ArrayList
				zeroCount++;		// Counts the number of zeros removed
			}
		}
		for(int j=0; j<zeroCount; j++) {
			arrayList.add(0);		// Adds the number of zeros that have been removed in the above step
		}
		System.out.println("ArrayList after moving the zeros to the end:");
		System.out.println(arrayList);
	}

}
