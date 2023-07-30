package com.xworkz.boot;
import com.xworkz.app.Shop;
public class ShopKiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop=new Shop();
		
		System.out.println("Name:" +shop.name);
		System.out.println("Items:"  +shop.items);
		shop.service();
		shop.goods();
		

	}

}
