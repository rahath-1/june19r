package com.xworkz.app;



public class PoisonMushroom extends Mushroom  {

	public PoisonMushroom()
	{
		super("black",10,258,true);
		
		
		System.out.println("invocking no-args in const");
		
	}
	public PoisonMushroom(String type,int quantity,double price,boolean smooth)
	{
		super(type,quantity,price,smooth);
		System.out.println("invocking String ,int ,double ,boolean ");
		
		
	}
		
		
	}
