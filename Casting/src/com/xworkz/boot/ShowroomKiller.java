package com.xworkz.boot;

import com.xworkz.app.*;

public class ShowroomKiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showroom showroom = new Showroom();
		
      WatchShowroom watchShowroom=new WatchShowroom();
      MobileShowroom mobileShowroom=new MobileShowroom();
      ShowroomUtil.run(showroom);
       ShowroomUtil.run(watchShowroom);
       ShowroomUtil.run(mobileShowroom);
	}

}
