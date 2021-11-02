package com.wolken.maven.springcore;

public class Student {
	private int stuID;
	private String stuName;
	private String stuAddress;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName + ", stuAddress=" + stuAddress + "]";
	}
}
	
	
