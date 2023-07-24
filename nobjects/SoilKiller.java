class SoilKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in SoilKiller");
		
	    Soil soil=new Soil(5.8d,20d);
		
		soil.printInstance();
		
		System.out.println("\n");
		
		Soil soil1=new Soil(4.6d,22d);
		Soil.printStatic();
		soil.printInstance();
		System.out.println(soil1.pHLevel);
		System.out.println(soil1.moisturelevel);
	}
}