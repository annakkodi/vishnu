package com.bms.test;
import java.util.Date;
import java.util.Scanner;

import com.bms.dao.TransactionDaoImpl;
import com.bms.pojo.Transaction;


public class TransactionTest 
{
	public static void main(String[] args) 
	{
		int choice;
		String query;
		Transaction t = new Transaction();
		TransactionDaoImpl td = new TransactionDaoImpl();
		boolean flag;
		long accountNumber;
		String transactionType,transactionDate;
		int amount;
		transactionDate = new Date().toString();
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("1. Start Transaction\n2. Display Transaction By Id\n3. Display Transaction by Account Number\n4. Display All transactions\n5. Exit\nEnter your choice:");
		
		choice =  sc.nextInt();
		
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter account Number:");
			accountNumber = sc.nextLong();
			flag = td.accountExists(accountNumber);
	if(flag==true)
	{
			System.out.println("Select Type of Transaction:(Press 'CB' for Balance Enquiry ,'DB' for Debit and 'CR' for Credit)");
			transactionType =  sc.next();
			
			if(transactionType.equals("CB"))
			{
				
				long balance = td.checkBalance(accountNumber);
			//	System.out.println("Balance Amount");
		      //  System.out.println(rs.getLong("accountHolderBalance"));
				System.out.println("Your available balance is: "+balance);
				System.exit(0);
				
			}
			else if(transactionType.equals("DB"))
			{
				
			}
			else if(transactionType.equals("CR"))
			{
				
			}
			else
			{
				System.out.println("Invalid choice...Checkup karke aao...");
			}
			System.out.println("Enter amount");
			amount =  sc.nextInt();
			
			t.setAccountNumber(accountNumber);
			t.setTransactionType(transactionType);
			t.setTransactionDates(transactionDate);
			t.setAmount(amount);
			
			flag = td.beginTransaction(t);
			
			if(flag == true)
			{
				System.out.println("Transaction successful :)");
			}
			else
			{
				System.out.println("Something went wrong :(");
			}		
}
else
{
		System.out.println("Account does'nt exist...:(");
}
			
			break;
		
		case 2:

//			System.out.println("ENTER DISPLAY TRANSACTIONID ");
//			System.out.println("Enter TRANSACTIONID");
//			transactionId= sc.nextInt();
//			t=td.desplaytransactiontransactionId(transactionId);
			break;
		
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			System.out.println("BYE BYE");
			break;
		default:
			System.out.println("Invalid choice");
			
		}
		}
		while(choice<5);
	}
		
		
	}

