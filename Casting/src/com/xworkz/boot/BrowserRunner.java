package com.xworkz.boot;

import com.xworkz.app.*;

public class BrowserRunner {

	public static void main(String[] args) {
		
		Browser browser=new Browser();
		Browser browser1=new Opera();
		Browser browser2=new MicrosoftEdge();
		Browser browser3=new FireFox();
		
		BrowserUtil.answer(browser);
		BrowserUtil.answer(browser1);
		BrowserUtil.answer(browser2);
		BrowserUtil.answer(browser3);
		
		
		// TODO Auto-generated method stub

	}

}
