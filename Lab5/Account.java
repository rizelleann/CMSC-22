

public class Account {

	private int accountNumber;
	private double balance; 

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;

	}
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public int getAccountNumber() { 
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	// ============================================================================
	//	M	E	T 	H	O	D 	S
	//=============================================================================


	public void credit(double amount) {
		this.balance += amount;

	setBalance(balance);

	} 

	public void debit(double amount) {
	
		if (this.balance >= amount){
			this.balance -= amount;
		} else {
			System.out.println("Amount withdrawn exceeds the current balance!");
		}

	setBalance(balance);
	}

	public String toString() {
		return String.format("A/C no: %d, Balance = $ %.2f",accountNumber, balance);
	}


}