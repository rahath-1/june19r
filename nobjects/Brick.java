class Brick{
	
	static String manfrName;
	static String color;
	int length;
	double price;


    Brick(int length,double price)   
	{
		this.length=length;
		this.price=price;
		System.out.println("invocking int, double in Brick");
		System.out.println("\n");
	}	
	
	static { 
        manfrName="BTR";
		color="Red";
		System.out.println("invocking static block in Brick");
		System.out.println("\n");
	}
	
	static void printStatic()            
	{
        System.out.println("Running printStatic block in Brick");
		System.out.println(manfrName);
		System.out.println(color);
		System.out.println("\n");
	}
	
	void printInstance()                   
	{
		System.out.println("Running printInstance block in Brick");
		System.out.println(this.length);
		System.out.println(this.price);
	}
}