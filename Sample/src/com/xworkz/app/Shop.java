package com.xworkz.app;

public class Shop {
	
	public String name="Art World";
	public  String items="1234th";
	public Salesman salesman=new Salesman();
	public void service()
	{
		if(this.salesman!=null)
		{
			this.salesman.monitor();
		
		System.out.println("Invoking Service Shop");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public void goods()
	{
		if(this.salesman!=null)
		{
			
		this.salesman.sell();
		System.out.println("Invoking Goods Shop");
		}
	}

}





