package com.xworkz.boot;

import com.xworkz.app.*;
public class SunKiller {

	public static void main(String[] args) {
		SmartWatch smartWatch = new SmartWatch();
		System.out.println(smartWatch.price);
		smartWatch.monitor();
		System.out.println(smartWatch.brand);
		smartWatch.timing();
		System.out.println(smartWatch.shape);
		smartWatch.display();
		System.out.println(smartWatch.material);
		smartWatch.calibrate();
		System.out.println(smartWatch.temp);
		smartWatch.temperature();

	}

}
