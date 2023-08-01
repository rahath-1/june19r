package com.xworkz.app;

public class ToothPaste {

	
	String name;
	public String brand;
	public Ingredient[] ingredient;
	public Company company=new Company("Colgate","Col-Gate","India");
	public ToothPaste(String name, String brand,Ingredient[] ingredient)
	{
		System.out.println("Invoking ToothPaste Function");
		this.name=name;
		this.brand=brand;
		this.ingredient=ingredient;
	}
	public void printInfo()
	{
		System.out.println("Invoking printInfo in ToothPaste");
		System.out.println("Name: " +this.name);
		System.out.println("Brand :"+ this.brand);
		for(int i=0;i<this.ingredient.length;i++)
		{
			Ingredient ref=this.ingredient[i];
		}
		company.printInfo();
	}
}
