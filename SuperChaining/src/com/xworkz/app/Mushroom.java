package com.xworkz.app;

public class Mushroom {

	public String type;
	public int quantity;
	public double price;
	public boolean smooth;
	
	public Mushroom(String type,int quantity,double price,boolean smooth)
	{
		
		System.out.println("invocking Mushroom ");
		this.type=type;
		this.price=price;
		this.smooth=smooth;
		this.quantity=quantity;
		
		
	}
	
}
