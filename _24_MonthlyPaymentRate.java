package programs;

import java.util.Scanner;

public class _24_MonthlyPaymentRate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line;
		line = in.nextLine();
		in.close();
		String[] num = line.split("~");
		int[] conv = {0,0,0,0};
		int k=0;
		for(String s: num){
			conv[k] = Integer.parseInt(s.trim());
			k++;
		}
		double annualInterestRate = conv[2];
		int numberOfYears = conv[1];                    
		int numPayments = numberOfYears*12;                  
		double loanAmount = conv[0];                       
		double downpayment = conv[3];
		double AmtAfterDown = loanAmount -downpayment ;
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = AmtAfterDown * monthlyInterestRate / (1 -(1 / Math.pow(1 + monthlyInterestRate, numPayments)));
		int formattedPaymentAmount = (int)(monthlyPayment * 100);
		monthlyPayment = (double)formattedPaymentAmount / 100;
		double Total_interest = monthlyPayment*numPayments - AmtAfterDown;
		String outputString = "$"+ String.format("%.2f", monthlyPayment)+"~$"+Math.round(Total_interest);
		System.out.println(outputString);

	}

}
