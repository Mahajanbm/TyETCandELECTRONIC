package com.example.demo;

public class Employee {
	int eId;
	String eName;
	String eCity;

	void getData(int eId,String eName,String eCity)
	{
		this.eId=eId;
		this.eName=eName;
		this. eCity=eCity;
	}
	void display()
	{
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eCity);
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getData(101, "Ajay", "Pune");
		e1.display();
	}
}
