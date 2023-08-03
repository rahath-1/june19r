package com.xworkz.boot;

import com.xworkz.app.*;

public class BrandRunner {
	
	public static void main(String[] args) {
		Brand brand =new Brand();
		
		Brand brand1=new InternationalBrand();
		Brand brand2=new NationalBrand();
		Brand brand3=new LocalBrand();
		Brand brand4=new DuplicateBrand();
		
		BrandUtil.sell(brand1);
		BrandUtil.sell(brand2);
		BrandUtil.sell(brand3);
		BrandUtil.sell(brand4);
		
	}

}
