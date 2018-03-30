package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_StringsMakingAnagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two words:");
		String a = in.next();
		String b = in.next();
		in.close();
		System.out.println(numberNeeded(a, b)+" characters must be deleted to make the two words Anagrams. ");
	}
	public static int numberNeeded(String first, String second) {

		char[] a = first.toCharArray();
		char[] b = second.toCharArray();
		ArrayList<Character> arrayListOfA = new ArrayList<>();
		ArrayList<Character> arrayListOfB = new ArrayList<>();
		int size,count=0;

		for(int i=0; i<a.length; i++){
			arrayListOfA.add(a[i]);		// Adding the characters of first string to arrayListOfA
		}

		for(int i=0; i<b.length; i++){
			arrayListOfB.add(b[i]);		// Adding the characters of second string to arrayListOfB
		}

		while(count<=(a.length+1)){		// Repeats the loop so that no characters in ArrayLists A & B are missed from deletion 
			for(int i=0; i<arrayListOfA.size(); i++){
				for(int j=0; j<arrayListOfB.size(); j++){
					if(i<arrayListOfA.size() && j<arrayListOfB.size()){		// To make sure arrays don't throw OutOfBoundsException    			
						if(arrayListOfA.get(i).equals(arrayListOfB.get(j))){		
							arrayListOfA.remove(i);		// Deleting the matched characters from both ArrayLists
							arrayListOfB.remove(j);
							count++;
						}
					}
				}

			}
			count++;
		}

		size = arrayListOfA.size()+arrayListOfB.size();		// Adding the number of characters left after deleting the matched characters from ArrayList A & B
		return size;

	}

}
