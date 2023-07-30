package com.xworkz.app;

public class Hotel {
	
	public String name="5-star";
	Cook cook =new Cook();
	public void staff()
	{
		System.out.println("Invoking Hotel main");
		if(this.cook!=null)
		{
			this.cook.cutting();
			
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public void type()
	{
		System.out.println("Invoking Hotel type  main");
		if(this.cook!=null)
		{
			this.cook.exprience();
			
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
