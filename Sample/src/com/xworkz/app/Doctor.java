package com.xworkz.app;

public class Doctor {
	
	public String name="Rahul";
	public String specialist="Optho";
	
	public Nurse nurse= new Nurse();
	
	public void study()
	
	{
		if(this.nurse!=null) {
			this.nurse.careTaker();
		System.out.println("Invoking Doctor study");
	}
		else
		{
			System.out.println("Invoking Doctor study is Invalid");	
		}
	}
    public void guide()
    {
    	if(this.nurse!=null)
    	{
    		
    	this.nurse.treatment();
    	System.out.println("Invoking Doctor guide");
    	}
    	else
    	{
    		System.out.println("Invoking Doctor guide is Invalid");
    	}
    }
}
