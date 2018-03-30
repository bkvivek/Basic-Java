package programs;

import java.util.Scanner;

public class _07_EmployeesHierarchy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int n = in.nextInt();
		in.nextLine();
		String[] employee = new String[n];
		System.out.println("Enter the employees details: ");
		for(int i=0; i<n; i++) {
			employee[i] = in.nextLine();
		}
		in.close();
		String[][] employeeArray = null ;
		for(int j=0; j<n; j++) {
			employeeArray[j]= employee[j].split(",");
		}
	}

}
