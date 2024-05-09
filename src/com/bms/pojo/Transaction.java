package com.bms.pojo;

public class Transaction
{
	private int transactionId;
	private String transactionType,transactionDates;
	private int amount;
	private Long accountNumber;
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionDates() {
		return transactionDates;
	}
	public void setTransactionDates(String transactionDates) {
		this.transactionDates = transactionDates;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
