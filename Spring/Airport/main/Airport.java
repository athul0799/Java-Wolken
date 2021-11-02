package com.wolken.maven.springcore;

public class Airport {
	private int ID;
	private String Name;
	private String Address;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Airport [ID=" + ID + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
}
