package com.bms.dao;

import java.util.ArrayList;

import com.bms.pojo.BankAdmin;

public interface BankAdminDao 
{
	boolean addBankAdmin(BankAdmin b);
	boolean uppBankAdmin(BankAdmin b);
	boolean delectBankAdmin(BankAdmin b);
	boolean displayBankAdminById(int baId);
	ArrayList<BankAdmin>displayeAllBankAdmin();

}
