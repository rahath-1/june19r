class HelmetKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in HelmetKiller");
		
		Helmet helmet=new Helmet(350d,20);
		Helmet.printStatic();
		helmet.printInstance();
		
		System.out.println("\n");
		
		Helmet helmet1=new Helmet(400d,25);
		Helmet.printStatic();
		helmet.printInstance();
		System.out.println(helmet1.price);
		System.out.println(helmet1.size);
		
	}
}