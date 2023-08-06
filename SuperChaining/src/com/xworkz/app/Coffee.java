package com.xworkz.app;

public class Coffee {
	
	public String brand;
	public int price;
	
	public Coffee()
	{
		this("Bru",6);
		System.out.println("Invoking no-arg ");
		
		
	}
	
	public Coffee(String brand)
	{
		this.brand=brand;
		System.out.println("Invoking String arguments ");
	}
	public Coffee(String brand,int price)
	{
		this(brand);
		this.price=price;
		System.out.println("Ivoking String int argument");
	}
	

}
