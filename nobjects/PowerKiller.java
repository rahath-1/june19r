class PowerKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in PowerKiller");
		
	    Power power=new Power(50d,"Generator");
		Power.printStatic();
		power.printInstance();
		
		System.out.println("\n");
		
		Power power1=new Power(60,"Battery");
		Power.printStatic();
		power.printInstance();
		System.out.println(power1.frequency);
		System.out.println(power1.source);
		
	}
}