package com.xworkz.boot;

import com.xworkz.app.*;

public class CoffeeRunner {

	public static void main(String[] args) {
		 Coffee coffee=new Coffee();
		
		System.out.println(coffee.brand);
		System.out.println(coffee.price);
		
		BlackCoffee blackCoffee=new BlackCoffee();
		System.out.println(coffee.brand);
		System.out.println(coffee.price);
		BlackCoffee blackCoffee2=new BlackCoffee();
		System.out.println(blackCoffee2.brand);
		System.out.println(blackCoffee2.price);
		

	}

}
