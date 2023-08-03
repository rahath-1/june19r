package com.xworkz.app;

public class ShowroomUtil {
	
	public static void run(Showroom showroom) {
		System.out.println(showroom.name);
		showroom.sell();
		
		if(showroom instanceof WatchShowroom )
		{
			System.out.println("Invoking main function...");
			WatchShowroom watchShowroom=(WatchShowroom)showroom;
			System.out.println(watchShowroom.price);
			watchShowroom.discount();
		}
		if(showroom instanceof MobileShowroom )
		{
			System.out.println("Invoking main function...");
			MobileShowroom mobileShowroom=(MobileShowroom)showroom;
			System.out.println(mobileShowroom.number);
			mobileShowroom.service();
		}
	}



	
}