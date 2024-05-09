package com.bms.pojo;

public class BankAdmin 
{
	private int baid;
	private String  ba_emailid,ba_password,ba_name,ba_addreass;
    private	Long contactnumber;
	public int getBaid() {
		return baid;
	}
	public void setBaid(int baid) {
		this.baid = baid;
	}
	public String getBa_emailid() {
		return ba_emailid;
	}
	public void setBa_emailid(String ba_emailid) {
		this.ba_emailid = ba_emailid;
	}
	public String getBa_password() {
		return ba_password;
	}
	public void setBa_password(String ba_password) {
		this.ba_password = ba_password;
	}
	public String getBa_name() {
		return ba_name;
	}
	public void setBa_name(String ba_name) {
		this.ba_name = ba_name;
	}
	public String getBa_addreass() {
		return ba_addreass;
	}
	public void setBa_addreass(String ba_addreass) {
		this.ba_addreass = ba_addreass;
	}
	public Long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}
    
	
}
