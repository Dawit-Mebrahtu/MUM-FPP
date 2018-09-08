package lab4_3.employeeinfo;

class Account implements Comparable<Account>{
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	//private AccountType acctType;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		//this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	/*
	public AccountType getAccountType() {
		return acctType;
	}
	*/
	
	public double getBalance() {
		return balance;
	}
	
//	public String toString() {
//		//return "type = " + acctType + ", balance = " + balance;
//		return "Account type: " + acctType + "\n Current bal: $" + balance;
//	}

	//update the balance field
	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	//updates the balance field and returns true, unless
	//withdrawal amount is too large; in that case,
	//it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount < balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Account o) {
		if(this.equals(o.employee.getName()))
			return 1;
		return 0;
	}
	

	

}