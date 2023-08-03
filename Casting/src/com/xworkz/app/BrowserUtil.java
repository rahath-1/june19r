package com.xworkz.app;

public class BrowserUtil {

	
	public static void answer(Browser browser)
	{
		System.out.println("Invoking BrowserUtil Function...");
		
		if(browser instanceof Chrome)
		{
			System.out.println("Invoking Browser chrome");
			Chrome chrome=(Chrome)browser;
			System.out.println(chrome.year);
			chrome.read();
		}

		if(browser instanceof Opera)
		{
			System.out.println("Invoking Browser Opera");
		   Opera opera=(Opera)browser;
			System.out.println(opera.type);
			opera.copy();
		}

		if(browser instanceof FireFox)
		{
			System.out.println("Invoking Browser  FireFox");
			 FireFox  fireFox=( FireFox)browser;
			System.out.println( fireFox.founder);
			 fireFox.information();
		}
		if(browser instanceof MicrosoftEdge)
		{
			System.out.println("Invoking Browser  MicrosoftEdge");
			MicrosoftEdge  microsoftEdge=( MicrosoftEdge)browser;
			System.out.println( microsoftEdge.workers);
			microsoftEdge.execute();
		}
	}
}
