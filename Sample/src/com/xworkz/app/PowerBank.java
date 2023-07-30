package com.xworkz.app;

public class PowerBank {
	public String type="mi";
	public int price=2000;

	public Battery battery=new Battery();
	
	public void memory()
	{
		System.out.println("Invoking PoweBank Memory");
		
		if(this.battery!=null)
		{
			this.battery.capacity();
			
			
		}
		else
		{
			System.out.println("Not printed");
		}
	}
	public void processor()
	{
		System.out.println("Invoking PowerBank Processor");
		if(this.battery!=null)
		{
			this.battery.name();
		}
		else
		{
		System.out.println("Not printed");
	    }
	
}
}

