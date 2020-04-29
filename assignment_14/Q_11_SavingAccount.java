package assignment_14;

public class Q_11_SavingAccount extends Q_11_BankAccount{
	
	private double interestRate;
	
	

	public Q_11_SavingAccount(double interestRate) {
		System.out.println("Account Owner: " + super.getAccountHolder());
		System.out.println("Account Number: " + super.getAccountNumber());
		this.interestRate = interestRate;
	}



	public double getInterestRate() {
		
		return interestRate;
	}

	
}
