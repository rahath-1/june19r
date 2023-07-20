class Mall
{
	char floor;
	String name;
	String location;
	int distance;
	float noOfVisitors;
	String shopName;
	int noOfShops;
	
	Mall()
	{
		System.out.println("Invoking Mall Info in ....");
		
	}
	Mall(char floor)
	{
	   System.out.println("Invoking Mall Info of byte ....");
	   this.floor=floor;
	}
	Mall(char floor,String name)
	{
	   this(floor);
	   System.out.println("Invoking Mall Info in byte,String ....");
	   this.name=name;
	}
	Mall(char floor,String name,String location)
	{
	   this(floor,name);
	   this.location=location;
	   System.out.println("Invoking Mall Info in byte,String,String....");
	}
	Mall(char floor,String name,String location,int distance)
	{
	   this(floor,name,location);
	   this.distance=distance;
	   System.out.println("Invoking Mall Info in byte,String,String,int....");
	   
	}
	
	Mall(char floor,String name,String location,int distance,float noOfVisitors)
	{
	   this(floor,name,location,distance);
	   this.noOfVisitors=noOfVisitors;
	   System.out.println("Invoking Mall Info in byte,String,String,int,float....");
	   
	}
	Mall(char floor,String name,String location,int distance,float noOfVisitors,String shopName)
	{
	   this(floor,name,location,distance,noOfVisitors);
	   this.shopName=shopName;
	   System.out.println("Invoking Mall Info in byte,String,String,int,float,int......");
	   
	}
	Mall(char floor,String name,String location,int distance,float noOfVisitors,String shopName,int noOfShops)
	{
	   this(floor,name,location,distance,noOfVisitors,shopName);
	   this.noOfShops=noOfShops;
	   System.out.println("Invoking Mall Info in byte,String,String,int,float,int......");
	   System.out.println(floor);
	   System.out.println(name);
	   System.out.println(location);
	   System.out.println(distance);
	   System.out.println(noOfVisitors);
	   System.out.println(shopName);
	   System.out.println(noOfShops);
	}
	
}
	
	
	
	
	
	