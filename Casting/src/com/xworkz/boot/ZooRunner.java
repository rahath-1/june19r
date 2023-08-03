package com.xworkz.boot;


import com.xworkz.app.*;
public class ZooRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo=new Zoo();
		
		Zoo zoo1=new StateZoo();
		Zoo zoo3=new NationalZoo();
		ZooUtil.wildLife(zoo);
		ZooUtil.wildLife(zoo1);
		ZooUtil.wildLife(zoo3);
		

	}

}
