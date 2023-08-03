package com.xworkz.boot;

import com.xworkz.app.*;

public class ChocolateRunner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Chocolate chocolate=new Chocolate();
		
		Chocolate chocolate1=new DarkChocolate();
		Chocolate chocolate2=new CaramelChocolate();
		
		ChocolateUtil.share(chocolate);
		ChocolateUtil.share(chocolate1);
		ChocolateUtil.share(chocolate2);
		
		

	}

}
