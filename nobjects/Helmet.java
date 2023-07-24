class Helmet{
	
	static String type;
	static String material;
	double price;
	int size;


    Helmet(double price , int size)   
	{
		this.price=price;
		this.size=size;
		System.out.println("invocking String, String in Helmet");
		System.out.println("\n");
	}	
	
	
	static {                           
		type="Open Space";
		material="Fiber";
		System.out.println("invocking static block in Helmet");
		System.out.println("\n");
	}
	
	static void printStatic()            
	{
        System.out.println("Running printStatic block in Helmet");
		System.out.println(type);
		System.out.println(material);
		System.out.println("\n");
	}
	
	void printInstance()                  
	{
		System.out.println("Running printInstance block in Helmet");
		System.out.println(this.price);
		System.out.println(this.size);
	}
}