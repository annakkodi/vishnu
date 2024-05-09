package com.bms.dao;


import java.util.ArrayList;

import com.bms.pojo.Transaction;

public interface TransactionDao 
{
boolean accountExists(long accountNumber);
	
	long checkBalance(long accountNumber);
	
	boolean beginTransaction(Transaction t);
	
	Transaction displayTransaction(int id);
	
	Transaction displayTransaction(double accountNumber);
	
	ArrayList<Transaction>displayAllTransaction();
}
