package com.xworkz.app;

public class Building {
	
	public String buildName;
	public String location;
	public int noOfRooms;
	
	
	Floor floor1=new Floor(1,"Ground");
	Floor floor2=new Floor(2,"First");
	Floor floor3=new Floor(3,"Second");
	Floor floor4=new Floor(4,"Third");
	Floor floor5=new Floor(5,"Fourth");
	Floor floor6=new Floor(6,"Fifth");
	Floor floor7=new Floor(7,"Sixth");
	
	public Floor[] floor= {floor1,floor2,floor3,floor4,floor6,floor7};
	
	
	Lift lift1=new Lift("NA");
	Lift lift2=new Lift("BA");
	public Lift[] lift= {lift1,lift2};
	
	public Building(String buildName,String location,int noOfRooms)
	{
		System.out.println("Invoking main Buildig function");
		this.buildName=buildName;
		this.location=location;
		this.noOfRooms=noOfRooms;
	}
	public void printInfo()
	{
		System.out.println("");
		System.out.println("Invoking printInfo in Building");
		System.out.println("Name: " +this.buildName);
		System.out.println("location :"+ this.location);
		System.out.println("noOfRooms :"+ this.noOfRooms);
		for(int i=0;i<this.floor.length;i++)
		{
			Floor floors =floor[i];
			floors.printInfo();
			
		}
		for(int i=0;i<lift.length;i++)
		{
		Lift lifts =lift[i];
		lifts.printIno();
	     }
	}
	

}
