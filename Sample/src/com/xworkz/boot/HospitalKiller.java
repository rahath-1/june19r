package com.xworkz.boot;

import com.xworkz.app.Hospital;

public class HospitalKiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hospital hospital=new Hospital();
      System.out.println("Name :"+ hospital.name);
      System.out.println("Location: "+hospital.location);
      hospital.floor();
      hospital.staff();
      
	}

}
