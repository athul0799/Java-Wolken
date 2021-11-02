package com.wolken.maven.springcore;

public class Mall {
	private int Number;
	private String Name;
	private String Address;
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
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
		return "Mall [Number=" + Number + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
}
