class Wood
{
	int price;
	String type;
	double weight;
	String color;
	
	Wood()
	{
		super();
		System.out.println("Invoking wood main");
	}
	Wood(int price)
	{
		super();
	    System.out.println("Invoking wood int price main");	
		this.price=price;
	}
	Wood(int price,String type)
	{
		this(price);
	    System.out.println("Invoking wood int price,String type main");	
		
		this.type=type;
	}
	Wood(int price,String type,double weight)
	{
	    	
		this(price,type);
		this.weight=weight;
		System.out.println("Invoking wood int price,String type ,double weight,main");
	}
	Wood(int price,String type,double weight,String color)
	{
		
	    
	    this(price,type,weight);
		this.color=color;
		System.out.println(color);
		System.out.println("Invoking wood int price,String type ,double weight,String color,main");	
	}
}
