package com.learning.core.day04;

class BankAccount {
	int accNo;
	String custName;
	String accType;
	float balance;

	public BankAccount(int accNo, String custName, String accType, float balance)

	{
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	public void deposit(float amt) throws NegativeAmount {
		if (amt > 0) {
			balance += amt;
		} else
			throw new NegativeAmount("Negative amount");
	}

	public float getBalance() throws LowBalanceException {
		if (balance < 1000) {
			throw new LowBalanceException("Low Blance");
		} else
			return balance;
	}

}

class NegativeAmount extends Exception {
	public NegativeAmount(String str) {
		super(str);
	}
}

class LowBalanceException extends Exception {

	public LowBalanceException(String str) {
		super(str);
	}
}

public class D04P01 {
	public static void main(String[] args) throws NegativeAmount, LowBalanceException {
		BankAccount bank = new BankAccount(123, "john", "Saving", 900);
		float b = 0;

		try {
			float balance = bank.getBalance();
			System.out.println("Current balance: " + balance);
		} catch (LowBalanceException e) {
			System.err.println(e.getMessage());
		}

		try {
			bank.deposit(-100);
		} catch (NegativeAmount e) {
			System.err.println("Error during deposit: " + e.getMessage());
		}
	}
}