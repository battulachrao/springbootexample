package com.javatpoint.server.main.user;

import java.sql.Date;

public class User {
	private int Id;
	private String Name;
	private Date Dob;
	public User(int i, String string, java.util.Date date) {
		// TODO Auto-generated constructor stub
		this.Id=i;
		this.Name=string;
		this.Dob=(Date) date;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Dob=" + Dob + "]";
	}
	

}
