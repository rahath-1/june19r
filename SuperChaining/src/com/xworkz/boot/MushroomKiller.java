package com.xworkz.boot;



import com.xworkz.app.*;

public class MushroomKiller {
	public static void main(String[] args) {
		System.out.println("invocking in main MushroomRunner");
		
		 PoisonMushroom mushroom=new PoisonMushroom();
		System.out.println(mushroom.type);
		System.out.println(mushroom.quantity);
		System.out.println(mushroom.price);
		System.out.println(mushroom.smooth);
			
			
		 PoisonMushroom mushroom1=new PoisonMushroom("white Mushroom",30,500,true);
			System.out.println(mushroom1.type);
			System.out.println(mushroom1.quantity);
			System.out.println(mushroom1.price);
			System.out.println(mushroom1.smooth);
				
			
	}

}
