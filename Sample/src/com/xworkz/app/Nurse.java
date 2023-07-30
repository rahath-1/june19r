package com.xworkz.app;

public class Nurse {

	
	public int experience=2;
	public String shift="Day";
	public Patient patient=new Patient();
	
	public void careTaker()
	{
		if(this.patient!=null)
		{
			this.patient.sick();
		System.out.println("Invoking Nurse Function is CareTake");
	}
		else
		{
			System.out.println("Invoking Nurse Function is CareTake is Invalid");
	}
	}
	public void treatment()
	{
		if(this.patient!=null)
		{
			this.patient.rest();
			System.out.println("Invoking Nurse Function Treatment");	
		}
		else
		{
		System.out.println("Invoking Nurse Function Treatment is Invalid ");
		}
	}
}
