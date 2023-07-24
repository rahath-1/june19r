class Power{
	
	static double voltage;
	static double current;
	double frequency;
	String source;
	

    Power(double frequency,String source)   
	{
		this.frequency=frequency;
		this.source=source;
		System.out.println("invocking double, double in Power");
		System.out.println("\n");
	}	
	
	static { 
        voltage=10d;
		current=4d;
		System.out.println("invocking static block in Power");
		System.out.println("\n");
	}
	
	static void printStatic()            
	{
        System.out.println("Running printStatic block in Power");
		System.out.println(voltage);
		System.out.println(current);
		System.out.println("\n");
	}
	
	void printInstance()                   
	{
		System.out.println("Running printInstance block in Power");
		System.out.println(this.frequency);
		System.out.println(this.source);
		
	}
}