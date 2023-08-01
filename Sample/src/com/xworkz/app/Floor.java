package com.xworkz.app;

public class Floor {
	public int noFloor;
	public String name;
	
	public Floor(int noFloor,String name)
	{
		System.out.println("Invoking main Floor function");
		this.noFloor=noFloor;
		this.name=name;
		
	}
	public void printInfo()
	{
		System.out.println("Invoking main printInfo function");
		System.out.println("Number of floor:"+noFloor );
		System.out.println("Name:"+ name);
	}

}
