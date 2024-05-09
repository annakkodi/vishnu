package com.bms.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.bms.dao.AccountHolderDaoImpl;
import com.bms.pojo.AccountHolder;

public class AccountHolderTest 
{
	public static void main(String...args)
	{
		int choice;
		Long accountNumber ,accountHolderContact,accountHolderAdharNum,accountHolderBalance;
		String accountHolderName,accountHolderAddress,accountHolderBranch,accountHolderIFSC,accountHolderPanCart,accountHolderOpDate,
		accountHolderType;
		boolean flag;
		AccountHolder ah =new AccountHolder();
		AccountHolderDaoImpl ahd= new AccountHolderDaoImpl(); 
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("*****WELCOM TO BANK MANAGMENT SYSTEM****\n1.Add Account\n2.Update Account\n3.delete Account\n4.Display AccountHolder By AccountNumber\n5.Display All AccountHolder\n6.Exit");
				
			System.out.println("******Enter your choice");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("_____ENTERR BELOW DETAILS TO ADD AccountHolder____");
				System.out.println("1,AccountNumber,2.AccountHolderName,3.AccountHolderContact,4.AccountHolderAddress,5.AccountHolderBranch,6.AccountHolderIFSC,7.AccountHolderAdharNum,8.AccountHolderPanCart,9.AccountHolderOpDate,10.AccountHolderType,11.AccountHolderBalan");
	
			    System.out.println("AccountHolderName");
				 accountHolderName = sc.next();
				 ah.setAccountHolderName(accountHolderName);
				System.out.println("AccountHolderContact");
				accountHolderContact = sc.nextLong();
				ah.setAccountHolderContact(accountHolderContact);
				System.out.println("AccountHolderAddress");
				accountHolderAddress = sc.next();
				ah.setAccountHolderAddress(accountHolderAddress);
				System.out.println("AccountHolderBranch");	
				accountHolderBranch = sc.next();
				 ah.setAccountHolderBranch(accountHolderBranch);
				System.out.println("AccountHolderIFSC");
				 accountHolderIFSC = sc.next();
				 ah.setAccountHolderIFSC(accountHolderIFSC);
				System.out.println("AccountHolderAdharNum");
				accountHolderAdharNum=sc.nextLong();
				 ah.setAccountHolderAdharNum(accountHolderAdharNum);
				System.out.println("AccountHolderPanCart");	
				accountHolderPanCart = sc.next();
				 ah.setAccountHolderPanCart(accountHolderPanCart);
				System.out.println("AccountHolderOpDate");
				accountHolderOpDate = sc.next();
				ah.setAccountHolderOpDate(accountHolderOpDate);
				System.out.println("AccountHolderType");
				   accountHolderType = sc.next();
				   ah.setAccountHolderType(accountHolderType);
				System.out.println("AccountHolderBalance");	
				accountHolderBalance = sc.nextLong();
				ah.setAccountHolderBalance(accountHolderBalance);
				
//                System.out.println("AccountNumber\r\n"
//                		+ "AccountHolderName\r\n"
//                		+ "AccountHolderContact\r\n"
//                		+ "AccountHolderAddress\r\n"
//                		+ "AccountHolderBranch\r\n"
//                		+ "AccountHolderIFSC\r\n"
//                		+ "AccountHolderAdharNum\r\n"
//                		+ "AccountHolderPanCart \r\n"
//                		+ "AccountHolderOpDate\r\n"
//                		+ "AccountHolderType\r\n"
//                		+ "AccountHolderBalance");
//                //foodName = sc.next();
//                AccountNumber = sc.nextLong();
//                AccountHolderName = sc.next();
//                AccountHolderContact = sc.nextLong();
//                AccountHolderAddress = sc.next();
//                AccountHolderBranch = sc.next();
//                AccountHolderIFSC = sc.next();
//                AccountHolderAdharNum=sc.nextLong();
//                AccountHolderPanCart = sc.next();
//                AccountHolderOpDate = sc.next();
//                AccountHolderType = sc.next();
//                AccountHolderBalance = sc.nextLong();
//                
//               // f.setFoodName(foodName);
//                ah.setAccountNumber(AccountNumber);
//                ah.setAccountHolderName(AccountHolderName);
//                ah.setAccountHolderContact(AccountHolderContact);
//                ah.setAccountHolderAddress(AccountHolderAddress);
//                ah.setAccountHolderBranch(AccountHolderBranch);
//                ah.setAccountHolderIFSC(AccountHolderIFSC);
//                ah.setAccountHolderAdharNum(AccountHolderAdharNum);
//                ah.setAccountHolderPanCart(AccountHolderPanCart);
//                ah.setAccountHolderOpDate(AccountHolderOpDate);
//                ah.setAccountHolderType(AccountHolderType);
//                ah.setAccountHolderBalance( AccountHolderBalance);
                flag = ahd.addAccountHolder(ah);
    			if(flag == true)
    			{
    				System.out.println("AccountHolder add SUCCESSFULLY.....");
    			}
    			else
    			{
    				System.out.println("AccountHolder add faild");
    			}
				break;
			case 2:
				System.out.println("____________ENTERR ID TO  update AccountHolder _________________");
				System.out.println("Enter account Number");
				accountNumber=sc.nextLong();
				ah.setAccountNumber(accountNumber);
                System.out.println("1.AccountHolderName");
                accountHolderName= sc.next();
                ah.setAccountHolderName(accountHolderName);
                System.out.println("2.AccountHolderContact");
                accountHolderContact= sc.nextLong();
                ah.setAccountHolderContact(accountHolderContact);
                System.out.println("3.AccountHolderAddress");
                accountHolderAddress= sc.next();
                ah.setAccountHolderAddress(accountHolderAddress);
                System.out.println("4.AccountHolderBranch");
                accountHolderBranch= sc.next();
                ah.setAccountHolderBranch(accountHolderBranch);
                System.out.println("5.AccountHolderIFSC");
                accountHolderIFSC= sc.next();
                ah.setAccountHolderIFSC(accountHolderIFSC);
                System.out.println("6.AccountHolderAdharNum");
                accountHolderAdharNum= sc.nextLong();
                ah.setAccountHolderAdharNum(accountHolderAdharNum);
                System.out.println("7.AccountHolderPanCart ");
                accountHolderPanCart= sc.next();
                ah.setAccountHolderPanCart(accountHolderPanCart);

                System.out.println("8.AccountHolderOpDate");
                accountHolderOpDate= sc.next();
                ah.setAccountHolderOpDate(accountHolderOpDate);

                System.out.println("9.AccountHolderType");
                accountHolderType= sc.next();
                ah.setAccountHolderType(accountHolderType);

                System.out.println("10.AccountHolderBalance");
                accountHolderBalance= sc.nextLong();
                ah.setAccountHolderBranch(accountHolderBranch);
 
//                System.out.println("1.AccountNumber");
//                AccountNumber= sc.nextLong();
              //  f.setFoodId(foodId);
               // ah.setAccountNumber(AccountNumber); 
             //   ah.setAccountHolderName(AccountHolderName);
             //   ah.setAccountHolderContact(AccountHolderContact);
              //  ah.setAccountHolderAddress(AccountHolderAddress);
             //   ah.setAccountHolderBranch(AccountHolderBranch);
               // ah.setAccountHolderIFSC(AccountHolderIFSC);
//                ah.setAccountHolderAdharNum(AccountHolderAdharNum);
//                ah.setAccountHolderPanCart(AccountHolderPanCart);
       //         ah.setAccountHolderOpDate(AccountHolderOpDate);
//                ah.setAccountHolderType(AccountHolderType);
//                ah.setAccountHolderBranch(AccountHolderBranch);
                flag = ahd.updateAccountHolder(ah);
    			if(flag == true)
    			{
    				System.out.println("AccountHolder Update SUCCESSFULLY.....");
    			}
    			else
    			{
    				System.out.println("AccountHolder Update faild");
    			}
                break;
			case 3:
				System.out.println("____________ENTERR delete AccountHolder_________________");
				System.out.println("Enter tha AccountHolderNumber");
				accountNumber = sc.nextLong();
	
				flag = ahd.deleteAccountHolder(accountNumber);
			
				if(flag==true)
				{
					System.out.println("FOOD Delete SUCCESSFULLY.....");
				}
				else
				{
					System.out.println("Food Delete faild");
				}
				break;
			case 4:
				System.out.println("____________ENTERR display AccountHolder By AccountNumber_________________");
                System.out.println("Enter AccountNumber");
                accountNumber=sc.nextLong();
                ah=ahd.displayAccountHolderByaccountNumber(accountNumber);
                System.out.println("****Account details*******");
                System.out.println(ah.getAccountHolderName()+" "+ah.getAccountHolderContact()+" "+ah.getAccountHolderAddress()+" "+ah.getAccountHolderBranch()+" "+ah.getAccountHolderIFSC()+" "+ah.getAccountHolderAdharNum()+" "+ah.getAccountHolderPanCart()+" "+ah.getAccountHolderOpDate()+" "+ah.getAccountHolderType()+" "+ah.getAccountHolderBalance());
				break;
			case 5:
				System.out.println("____________ENTERR display All AccountHolder_________________");

				ArrayList<AccountHolder>ahf= new ArrayList<AccountHolder>();
				ahf= ahd.displayAllAccountHolder();
				for(AccountHolder i:ahf)
				{
	              //  System.out.println(ah.getAccountNumber()+" "+ah.getAccountHolderName()+" "+ah.getAccountHolderContact()+" "+ah.getAccountHolderAddress()+" "+ah.getAccountHolderBranch()+" "+ah.getAccountHolderIFSC()+" "+ah.getAccountHolderAdharNum()+" "+ah.getAccountHolderPanCart()+" "+ah.getAccountHolderOpDate()+" "+ah.getAccountHolderType()+" "+ah.getAccountHolderBalance());
	                System.out.println("AccountNumber:"+i.getAccountNumber());
	                System.out.println("AccountHolderName:"+i.getAccountHolderName());
	                System.out.println("AccountHolderContact:"+i.getAccountHolderContact());
	                System.out.println("AccountHolderAddress :"+i.getAccountHolderAddress());
	                System.out.println("AccountHolderBranch:"+i.getAccountHolderBranch());
	                System.out.println("AccountHolderIFSC:"+i.getAccountHolderIFSC());
	                System.out.println("AccountHolderAdharNum:"+i.getAccountHolderAdharNum());
	                System.out.println("AccountHolderPanCart:"+i.getAccountHolderPanCart());
	                System.out.println("AccountHolderOpDate:"+i.getAccountHolderOpDate());
	                System.out.println("AccountHolderType:"+i.getAccountHolderType());
	                System.out.println("AccountHolderBalance:"+i.getAccountHolderBalance());	
	                System.out.println();			
				}
				break;
			case 6:
				System.out.println("paise nasel accout open karayla tra....ghri jaa");
			default:
				System.out.println("Invalid number");
			}
			
			
		}while(choice<5);
	}

}
