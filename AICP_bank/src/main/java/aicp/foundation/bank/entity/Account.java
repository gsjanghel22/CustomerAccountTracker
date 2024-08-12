package aicp.foundation.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private int accountNumber;
	private String accountType;
	private int amount;
	
	public Account() {
		super();
	}

	public Account(String accountType, int amount) {
		super();
		this.accountType = accountType;
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", amount=" + amount + "]";
	}

	
}
