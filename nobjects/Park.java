class Park
{
	String name;
	int distance;
	float area;
	String location;
	long noOfVisitors;
	String parkType;
	long noOfTrees;
	int noOfGates;
	float seats;
	
	Park()
	{
		System.out.println("Invoking Park Main Information");
	}
	Park(String name)
	{
		System.out.println("Invoking Park Main Information for String");
		this.name=name;
	}
	Park(String name,int distance)
	{
		this(name);
		System.out.println("Invoking Park Main Information for String , int");
		this.distance=distance;
	}
	Park(String name,int distance,float area)
	{
		this(name,distance);
		System.out.println("Invoking Park Main Information for String , int,float");
		this.area=area;
	}
	Park(String name,int distance,float area,String location)
	{
		this(name,distance,area);
		System.out.println("Invoking Park Main Information for String , int,float,String");
		this.location=location;
	}
	Park(String name,int distance,float area,String location,long noOfVisitors)
	{
		this(name,distance,area,location);
		this.noOfVisitors=noOfVisitors;
		System.out.println("Invoking Park Main Information for String , int,float,String,long");
		
	}
	Park(String name,int distance,float area,String location,long noOfVisitors,String parkType)
	{
		this(name,distance,area,location,noOfVisitors);
		this.parkType=parkType;
		System.out.println("Invoking Park Main Information for String , int,float,String,long,..long");
		
	}
	Park(String name,int distance,float area,String location,long noOfVisitors,String parkType,long noOfTrees)
	{
		this(name,distance,area,location,noOfVisitors,parkType);
		this.noOfTrees=noOfTrees;
		System.out.println("Invoking Park Main Information for String , int,float,String,long,String,.long");
		
	}
	Park(String name,int distance,float area,String location,long noOfVisitors,String parkType,long noOfTrees,int noOfGates)
	{
		this(name,distance,area,location,noOfVisitors,parkType,noOfTrees);
		this.noOfGates=noOfGates;
		System.out.println("Invoking Park Main Information for String , int,float,String,long,String,.long,,byte");
		
	}
	Park(String name,int distance,float area,String location,long noOfVisitors,String parkType,long noOfTrees,int noOfGates,float seats)
	{
		this(name,distance,area,location,noOfVisitors,parkType,noOfTrees,noOfGates);
		this.seats=seats;
		System.out.println("Invoking Park Main Information for String , int,float,String,long,String,.long,,byte,,float");
		System.out.println(name);
		System.out.println(distance);
		System.out.println(area);
		System.out.println(location);
		System.out.println(noOfVisitors);
		System.out.println(parkType);
		System.out.println(noOfTrees);
		System.out.println(noOfGates);
		System.out.println(seats);
	}
}
	
	
	