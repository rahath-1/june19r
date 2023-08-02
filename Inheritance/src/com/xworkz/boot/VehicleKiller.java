package com.xworkz.boot;

import com.xworkz.app.Wheel;

public class Vehicle {

	public static void main(String[] args) {
		Wheel wheel=new Wheel();
		System.out.println(wheel.size);
		wheel.turn();
		System.out.println(wheel.wheels);
		wheel.transport();
		System.out.println(wheel.cost);
		wheel.ride();
		System.out.println(wheel.type);
		wheel.drive();
		System.out.println(wheel.name);
		wheel.showOff();
		
		
		// TODO Auto-generated method stub

	}

}
