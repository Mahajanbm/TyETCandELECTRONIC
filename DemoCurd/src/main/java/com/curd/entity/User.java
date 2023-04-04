package com.curd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblUser")
public class User {
	@Column(name="accno")
	@Id
	private int accno;
	@Column(name="userName")
	private String userName;
	@Column(name="address")
	private String address;
	@Column(name="mailId")
	private String MailId;
	@Column(name="mobile")
	private String mobile;
	@Column(name="branch")
	private String branch;
	@Column(name="IFSC")
	private String IFSC;
	@Column(name="accType")
	private String accType;
	@Column(name="balance")
	private float balance;
	@Column(name="bankName")
	private String bankName;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "User [accno=" + accno + ", userName=" + userName + ", address=" + address + ", MailId=" + MailId
				+ ", mobile=" + mobile + ", branch=" + branch + ", IFSC=" + IFSC + ", accType=" + accType + ", balance="
				+ balance + ", bankName=" + bankName + "]";
	}

}
