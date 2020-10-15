package cal;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		double loanAmt,  interestRate;
		int repayPeriod;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Loan Amount : ");
		loanAmt=scan.nextDouble();
		System.out.print("Enter Interest Rate (ex : 0.06) : ");
		interestRate=scan.nextDouble();
		System.out.print("Enter Repayment Period : ");
		repayPeriod=scan.nextInt();
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		TrialCal cal1 = new TrialCal(loanAmt, interestRate, repayPeriod);
		System.out.print("Rental / Instalment Value  (Monthy payment) : " );
		cal1.calInstalmentVal();
		System.out.println("\n\n\t\t\t Repayment Schedule\n");
		cal1.calRepaySch();

	}

}
