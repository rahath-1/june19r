package com.xworkz.app;

public class BrandUtil {
	
	public static void sell(Brand brand)
	{
	
		if(brand instanceof InternationalBrand)
		{
			System.out.println("Invoking BrandUtil..");
			InternationalBrand internationalBrand=new InternationalBrand();
			System.out.println(internationalBrand.cost);
			internationalBrand.print();
			
		}
		if(brand instanceof NationalBrand)
		{
			System.out.println("Invoking BrandUtil..");
			NationalBrand nationalBrand=new NationalBrand();
			System.out.println(nationalBrand.name);
			nationalBrand.manufacture();
			
		}
		if(brand instanceof LocalBrand)
		{
			System.out.println("Invoking BrandUtil..");
			LocalBrand localBrand=new LocalBrand();
			System.out.println(localBrand.price);
			localBrand.wear();
			
		}
		if(brand instanceof DuplicateBrand)
		{
			System.out.println("Invoking BrandUtil..");
	        DuplicateBrand duplicateBrand=new DuplicateBrand();
			System.out.println(duplicateBrand.name1);
			duplicateBrand.copy();
			
		}

}
}