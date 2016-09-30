/*
 * Test Driver for Account Class
*/
public class TestAccount {

	public static void main (String[] args) {

		Account myAccount = new Account(998, 1000.00);
		System.out.println(myAccount);


		//test getters and setters
		myAccount.setBalance(2000.00);
		System.out.println("Balance:" + myAccount.getBalance());


		//Test methods
		myAccount.credit(2000.00);
		System.out.println(myAccount);
		myAccount.debit(5000.00);
		System.out.println(myAccount);
	}
}