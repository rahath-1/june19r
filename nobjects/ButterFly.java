class ButterFly
{
	static String type;
	static String color;
	int weight;
	float canFly;
	
	ButterFly()
	{
		System.out.println();
		
	}
    ButterFly(int weight,float canFly)
	{
		this.weight=weight;
		this.canFly=canFly;
		System.out.println("Invoking String,String ....main");
	}
	
	static
	{
		type="normal";
		color="Blue";
		System.out.println("Static type and color");
	}
	static void printStatic()
	{
		System.out.println("Invokig Static type and color");
		System.out.println(type);
		System.out.println(color);
	}
	void printInstance()
	{
		System.out.println("Invoking Instance values");
		System.out.println(this.weight);
		System.out.println(this.canFly);
	}
}
		
		