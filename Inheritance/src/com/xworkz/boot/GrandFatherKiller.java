package com.xworkz.boot;
import com.xworkz.app.*;

public class GrandFatherKiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Invoking Main GrandFather function.....");
    
    Son son=new Son();
    System.out.println(son.name);
    son.number();
    System.out.println(son.age);
    son.guide();
    System.out.println(son.child);
    son.storyTeller();
    
	}

}
