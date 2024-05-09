package com.bms.test;

import java.util.*;
public class BankAdminTest 
{
	public static void main(String...args)
	{
    Scanner sc = new Scanner(System.in);
	int choice,baid;
	String  ba_emailid,ba_password,ba_name,ba_addreass;
   	Long contactnumber;
   	do
   	{
   		System.out.println("***WELCOME TO BANKADMIN***\n1.Add BANKADMIN\n2.Update BANKADMIN \n3.Delete BANKADMIN \n4.Display BANKADMIN By BANKADMINID\n5.Display All BANKADMIN\n6.Exit\n**Enter your Choice**");
   		choice=sc.nextInt();
   		switch(choice)
   		{
   			case 1:
   				System.out.println("_____Enter Below Details to add BankAdmin______");
   				
   				
   				break;
   			case 2:
   				break;
   			case 3:
   			case 4:
   				break;
   			case 5:
   				break;
   			case 6:
				System.out.println("thank you ");
				break;
			default:
				System.out.println("Invalid Choice...Please Enter current choice...");
   				
   		}
   	}while(choice<6);
	}	
}

