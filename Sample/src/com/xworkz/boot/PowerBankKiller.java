package com.xworkz.boot;

import com.xworkz.app.*;

public class PowerBankKiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery battery=new Battery();
		PowerBank powerBank=new PowerBank();
		System.out.println("Name :" +battery.name);
		System.out.println("Type :" +powerBank.type);
		
		powerBank.memory();
		powerBank.processor();
		

	}

}
