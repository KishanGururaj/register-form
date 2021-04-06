package com.wolken.wolkenapp.dto;

public class RegisterServletDTO {
	private int userId;
	private String name;
	private String address;
	private long phoneNo;
	private String date;
	public RegisterServletDTO() {
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "RegisterServletDTO [userId=" + userId + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + ", date=" + date + "]";
	}
	

}
