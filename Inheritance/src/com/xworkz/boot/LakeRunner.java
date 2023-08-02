package com.xworkz.boot;

import com.xworkz.app.*;
public class LakeRunner {

	public static void main(String[] args) {
		Glass glass=new Glass();
		System.out.println(glass.size);
		glass.store();
		System.out.println(glass.capacity);
		glass.shape();
		System.out.println(glass.number);
		glass.number1();
		System.out.println(glass.length);
		glass.strength();
		System.out.println(glass.color);
		glass.connect();
		System.out.println(glass.width);
		glass.measure();
		System.out.println(glass.area);
		glass.boundary();
		

	}

}
