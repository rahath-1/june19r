class Soil{
	
	static String soilType;
	static String region;
	double pHLevel;
	double moisturelevel;


    Soil(double pHLevel,double moisturelevel)   
	{
		this.pHLevel=pHLevel;
		this.moisturelevel=moisturelevel;
		System.out.println("invocking double, double in Soil");
		System.out.println("\n");
	}	
	
	static { 
        soilType="Sandy";
		region="Bellary";
		System.out.println("invocking static block in Soil");
		System.out.println("\n");
	}
	
	static void printStatic()            
	{
        System.out.println("Running printStatic block in Soil");
		System.out.println(soilType);
		System.out.println(region);
		System.out.println("\n");
	}
	
	void printInstance()                   
	{
		System.out.println("Running printInstance block in Soil");
		System.out.println(this.pHLevel);
		System.out.println(this.moisturelevel);
		
	}
}