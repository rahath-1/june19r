package com.xworkz.app;

public class Ingredient {
	public String name;
	public int quantity;
	public int price;
	
	public Ingredient (String name,int quantity,int price)
	{
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public void printInfo()
	{
		System.out.println("Invoking printInfo of Ingredients");
		System.out.println(this.name);
		System.out.println(this.quantity);
		System.out.println(this.price);
	}

}
