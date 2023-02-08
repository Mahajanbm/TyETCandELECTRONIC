package com.example.demo;

public class Student {
	private	int sId;
	private String sName;
	private String sCity;

	public Student() {
		System.out.println("Student class Constructor");
	}
	static
	{
		System.out.println("this is static block");
	}
	
	
	{
		System.out.println("this is non-static block");
	}
	
	static void demo()
	{
		System.out.println("This is static method");
	}
	public void  setsId(int sId)
	{
		this.sId=sId;
	}
	public int getsId()
	{
		return sId;
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	
}
