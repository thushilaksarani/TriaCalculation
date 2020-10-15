package cal;

public class TrialCal {
	double loanAmt, interestRate,instalmentVal;
	int repayPeriod;
	
	public TrialCal(double loanAmt, double interestRate, int repayPeriod) {
		this.loanAmt = loanAmt;
		this.interestRate = interestRate;
		this.repayPeriod = repayPeriod;
	}

	public void calInstalmentVal() {
		instalmentVal= (loanAmt*(interestRate/12))/(1-(Math.pow((1+interestRate/12), (-repayPeriod))));
		System.out.println(instalmentVal);
	}
	
	public void calRepaySch() {
		double interestAmt, capitalAmt;
		double capitalBalnce=loanAmt;
		
		System.out.println("Rental No\tRental Value\tInterest Amount\t	Capital Amount\t   Capital Balance");
		System.out.println("0 \t\t 0 \t\t 0 \t\t\t 0 \t\t\t " + loanAmt);
		
		for(int i=1; i<=repayPeriod; i++) {
			interestAmt=capitalBalnce*interestRate/12;
			capitalAmt=instalmentVal-interestAmt;
			capitalBalnce=capitalBalnce-capitalAmt;
			
			System.out.println(i +"\t" + instalmentVal + "\t" + interestAmt + "\t" + capitalAmt + "\t" + capitalBalnce);
			
			
		}
	}
	
}
