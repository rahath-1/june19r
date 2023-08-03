package com.xworkz.app;

public class ZooUtil {
	
	public static void wildLife(Zoo zoo)
	{
		System.out.println("Invoking Zooutill");
	
	
	if(zoo instanceof StateZoo)
	{
		System.out.println("Invoking Zoo and satezoo");
		StateZoo statezoo=(StateZoo)zoo;
	    System.out.println(statezoo.location);	
	  statezoo.preserve();
	}
	if(zoo instanceof NationalZoo)
	{
		System.out.println("Invoking Zoo and Nationalzoo");
		NationalZoo nationalzoo=(NationalZoo)zoo;
	    System.out.println(nationalzoo.name);	
	    nationalzoo.secure();
	}

}
}

