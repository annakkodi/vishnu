package com.bms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import com.bms.pojo.AccountHolder;
import com.bms.pojo.Transaction;
import com.bms.utility.DBUtility;

public class TransactionDaoImpl implements TransactionDao
{
	String query;
	Connection conn;
	PreparedStatement ps;
	Transaction t=new Transaction();
	String transactionType;
	Scanner sc = new Scanner(System.in);
	ResultSet rs;


	@Override
	public boolean accountExists(long accountNumber) 
	{
query = "Select accountNumber from accountHolder where accountNumber = ?";
		
		try {
			conn = DBUtility.establishConnection();
			ps = conn.prepareStatement(query);
			ps.setLong(1,accountNumber);
			 rs = ps.executeQuery();
			
			while(rs.next())
			{
				return true;
			
			
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public long checkBalance(long accountNumber) {
		query = "Select accountBalance from accountHolder where accountNumber = ?";
		try {
			conn = DBUtility.establishConnection();
			ps = conn.prepareStatement(query);	
			ps.setLong(1,accountNumber);
			 rs = ps.executeQuery();
		
			while(rs.next())
			{
				long balance = rs.getLong(1);
				return balance;
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public boolean beginTransaction(Transaction t) 
	{
//Check balance, Withdraw(debit), Deposit(credit)
		
//		System.out.println("Select Type of Transaction:(Press 'C' for Balance Enquiry ,'DB' for Debit and 'CR' for Credit)");
//		transactionType =  sc.next();
//		
//		if(transactionType.equals("C"))
//		{
//			
//			
//		}
//		else if(transactionType.equals("DB"))
//		{
//			
//		}
//		else if(transactionType.equals("CR"))
//		{
//			
//		}
//		else
//		{
//			System.out.println("Invalid choice...Checkup karke aao...");
//		}
		query = "insert into Transaction(accountNumber,transactionType,transactionDates,amount)values(?,?,?,?)";
		try {
			conn = DBUtility.establishConnection();
			ps = conn.prepareStatement(query);
			
			ps.setLong(1, t.getAccountNumber());
			ps.setString(2, t.getTransactionType());
			ps.setString(3, t.getTransactionDates());
			ps.setInt(4, t.getAmount());
			
			int success = ps.executeUpdate();
			if(success>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public Transaction displayTransaction(int id) 
	{
//		query = "select * from Transaction where transactionId=?";
//		try {
//			conn= DBUtility.establishConnection();
//			ps=conn.prepareStatement(query);
//			ps.setInt(1.transactionId);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next())
//			{
//				t.setTransactionType(rs.getString(2));
//				t.setTransactionDates(rs.getString(3));
//				t.setAmount(rs.getInt(4));
//				t.setAccountNumber(rs.getLong(5));
//			}
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			
//			e.printStackTrace();
//		}
//
//		
		
		
		return t;
	}

	@Override
	public ArrayList<Transaction> displayAllTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction displayTransaction(double accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}

