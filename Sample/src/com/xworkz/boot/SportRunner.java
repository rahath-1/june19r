package com.xworkz.boot;
import com.xworkz.app.*;
public class SportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Invoking main in SportRunner");
		
		Player players1 = new Player("Ral", "oe");
		Player players2 = new Player("Virat", "Three");
		Player players3 = new Player("Sachin", "six");
		Player players4 = new Player("Dhoni", "Two");
		Player players5 = new Player("Rohit", "seven");

		Player[] players = { players1, players2, players3, players4, players5 };
		
		Sport sport=new Sport("Cricket", players);
		sport.printInfo();

	}

}
