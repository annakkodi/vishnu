package com.bms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bms.pojo.AccountHolder;
import com.bms.utility.DBUtility;



public class AccountHolderDaoImpl implements AccountHolderDao
{
	Connection conn;
	PreparedStatement ps;
	AccountHolder ah =new AccountHolder();
	String query;
	public boolean addAccountHolder(AccountHolder ah) 
	{
		query = "insert into AccountHolder(accountHolderName,accountHolderContact,accountHolderAddress,accountHolderBranch,accountHolderIFSC,accountHolderAdharNum,accountHolderPanCart, accountHolderOpDate,accountHolderType,accountHolderBalance)values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conn = DBUtility.establishConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1,ah.getAccountHolderName());
			ps.setLong(2,ah.getAccountHolderContact());
			ps.setString(3,ah.getAccountHolderAddress());
			ps.setString(4,ah.getAccountHolderBranch());
			ps.setString(5,ah.getAccountHolderIFSC());
			ps.setLong(6,ah.getAccountHolderAdharNum());
			ps.setString(7,ah.getAccountHolderPanCart());
			ps.setString(8,ah.getAccountHolderOpDate());
			ps.setString(9,ah.getAccountHolderType());
			ps.setLong(10,ah.getAccountHolderBalance());
	
			int success =ps.executeUpdate();
			if(success>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	//update Food set foodName = ?
	public boolean updateAccountHolder(AccountHolder ah) {
		query = "update AccountHolder set accountHolderName=?,accountHolderContact=?,accountHolderAddress=?,accountHolderBranch=?,accountHolderIFSC=?,accountHolderAdharNum=?,accountHolderPanCart=?,accountHolderOpDate=?,accountHolderType=?,accountHolderBalance=? where accountNumber=?";
		try {
			conn = DBUtility.establishConnection();
			ps = conn.prepareStatement(query);
		//	ps.setLong(1,ah.getAccountNumber());
			ps.setString(1,ah.getAccountHolderName());
			ps.setLong(2,ah.getAccountHolderContact());
			ps.setString(3,ah.getAccountHolderAddress());
			ps.setString(4,ah.getAccountHolderBranch());
			ps.setString(5,ah.getAccountHolderIFSC());
			ps.setLong(6,ah.getAccountHolderAdharNum());
			ps.setString(7,ah.getAccountHolderPanCart());
			ps.setString(8,ah.getAccountHolderOpDate());
			ps.setString(9,ah.getAccountHolderType());
			ps.setLong(10,ah.getAccountHolderBalance());
			ps.setLong(11,ah.getAccountNumber());
			int success =ps.executeUpdate();
			
	     	if(success>0)
	    	{
			    return true;
		    }
	    	else
		    {
			     return false;
		    }
			
		    } catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		    }
		    return true;
	}

	@Override
	public boolean deleteAccountHolder(Long accountNumber) 
	{
		query = "delete from AccountHolder where accountNumber=?";
		try {
			conn = DBUtility.establishConnection();
			ps= conn.prepareStatement(query);
			ps.setLong(1, accountNumber);
			int success = ps.executeUpdate();
			if(success>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public AccountHolder displayAccountHolderByaccountNumber(long accountNumber) 
	{
	//	"select * from Food where foodId=?";
		query = "select * from AccountHolder where accountNumber=?";
		try {
			conn= DBUtility.establishConnection();
			ps=conn.prepareStatement(query);
			ps.setLong(1, accountNumber);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ah.setAccountHolderName(rs.getString(2));
				ah.setAccountHolderContact(rs.getLong(3));
				ah.setAccountHolderAddress(rs.getString(4));
				ah.setAccountHolderBranch(rs.getString(5));
				ah.setAccountHolderIFSC(rs.getString(6));
				ah.setAccountHolderAdharNum(rs.getLong(7));
				ah.setAccountHolderPanCart(rs.getString(8));
				ah.setAccountHolderOpDate(rs.getString(9));
				ah.setAccountHolderType(rs.getString(10));
				ah.setAccountHolderBalance(rs.getLong(11));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ah;
	}

	@Override
	public ArrayList<AccountHolder> displayAllAccountHolder() 
	{
		query="select * from AccountHolder";
		ArrayList<AccountHolder>af=new ArrayList<AccountHolder>();
		try {
			conn=DBUtility.establishConnection();
			ps=conn.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			AccountHolder ah =new AccountHolder();
			ah.setAccountNumber(rs.getLong(1));
			ah.setAccountHolderName(rs.getString(2));
			ah.setAccountHolderContact(rs.getLong(3));
			ah.setAccountHolderAddress(rs.getString(4));
			ah.setAccountHolderBranch(rs.getString(5));
			ah.setAccountHolderIFSC(rs.getString(6));
			ah.setAccountHolderAdharNum(rs.getLong(7));
			ah.setAccountHolderPanCart(rs.getString(8));
			ah.setAccountHolderOpDate(rs.getString(9));
			ah.setAccountHolderType(rs.getString(10));
			ah.setAccountHolderBalance(rs.getLong(11));	
			
			af.add(ah);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return af;
	}

	
	
	}


