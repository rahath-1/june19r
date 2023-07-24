class Candle{
	
	static String color;
	static String material;
	float height;
	double price;


    Candle(float height,double price)   
	{
		this.height=height;
		this.price=price;
		System.out.println("invocking float, double in Candle");
		System.out.println("\n");
	}	
	
	static {                           
		color="Yellow";
		material="Paraffin";
		System.out.println("invocking static block in Candle");
		System.out.println("\n");
	}
	
	static void printStatic()            
	{
        System.out.println("Running printStatic block in Candle");
		System.out.println(color);
		System.out.println(material);
		System.out.println("\n");
	}
	
	void printInstance()                   
	{
		System.out.println("Running printInstance block in Candle");
		System.out.println(this.height);
		System.out.println(this.price);
	}
}