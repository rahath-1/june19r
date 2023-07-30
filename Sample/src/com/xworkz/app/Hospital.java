package com.xworkz.app;

public class Hospital {
	public String name="ESI";
	public String location="Banglore ";
	public Patient patient;
	public Nurse nurse;
	
	public Doctor doctor =new Doctor();
	public void floor()
	
	{
		if(this.doctor!=null)
		{
			
		
			this.doctor.study();
		  System.out.println("Invoking Main Study");
	}
	else
	{
		System.out.println("Invoking Main Study is Invalid");
	}
	
	}
	public void staff()
	{
		if(this.doctor!=null)
		{
			this.doctor.guide();
			System.out.println("Invoking Main Guide");
		}
		else
		{
			System.out.println("Invoking Main Guide is Invalid");
		}
	}

}
