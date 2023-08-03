package com.xworkz.app;

public class ChocolateUtil {
	
	public static void share(Chocolate chocolate)
	{
	   System.out.println("Invoking ChocolateUtill");
	
	if(chocolate instanceof CaramelChocolate)
	{
		System.out.println("Invoking Caramel-Chocolate");
		CaramelChocolate caramelChocolate=(CaramelChocolate)chocolate;
		System.out.println(caramelChocolate.quantity);
		caramelChocolate.eat();
	}
	if(chocolate instanceof DarkChocolate)
	{
		System.out.println("Invoking Dark-Chocolate");
		DarkChocolate darkChocolate=(DarkChocolate)chocolate;
		System.out.println(darkChocolate.price);
		darkChocolate.tasty();
	}


}
}