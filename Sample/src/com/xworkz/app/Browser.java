package com.xworkz.app;

public class Browser {
	
	public Internet internet;
	 public void retrieve() 
	 {
		 System.out.println("invoking retrieve in browser");
		 
		 if(internet!=null)
		 {
			 internet.accessibility();
		 }
	 }
	 public void scripting() {
		 System.out.println("invoking scripting in browser ");
		 if(internet!=null)
		 {
			 internet.security();
		 }
	 }
	 

}


