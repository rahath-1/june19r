class BrickKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in BrickKiller");
		
	    Brick brick=new Brick(15,150d);
		
		brick.printInstance();
		
		System.out.println("\n");
		
		Brick brick1=new Brick(20,200d);
		Brick.printStatic();
		brick.printInstance();
		System.out.println(brick1.length);
		System.out.println(brick1.price);
		
	}
}