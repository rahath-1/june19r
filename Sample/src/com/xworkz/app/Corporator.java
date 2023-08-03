package com.xworkz.app;

public class Corporator {
public String corpName;
	
	Building building=new Building("ESI ospitak","gandhi Nagara",2);
	Building building1=new Building("Xworkz","rajajiNagar",4);
	public Building[] buildings={building,building1};

	public Corporator(String corpName) {
		this.corpName = corpName;
	}

	public void printInfo() {
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Corporator name is "+this.corpName);
		for(int i=0;i<buildings.length;i++)
		{
			Building building=buildings[i];
			building.printInfo();
		}

	}

}
