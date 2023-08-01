package com.xworkz.boot;
import com.xworkz.app.*;
public class ToothPasteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking ToothPasteRunner in main Function");
		
		Ingredient ingredient1=new Ingredient("mint",250,20);
		Ingredient ingredient2=new Ingredient("charcoal",500,50);
		Ingredient ingredient3=new Ingredient("calciumr",200,25);
		Ingredient ingredient4=new Ingredient("tulsi",350,40);
		Ingredient ingredient5=new Ingredient("salt",500,50);
		
		Ingredient[] ingredientref= {ingredient1,ingredient2,ingredient3,ingredient4,ingredient5};
		
		System.out.println();
		ToothPaste toothPaste=new ToothPaste("Dabar","Amla",ingredientref);
		toothPaste.printInfo();
	}

}
