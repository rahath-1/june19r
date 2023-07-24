class ButterFlyKiller
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main ButterFlyKiller");
		
		ButterFly butterFly=new ButterFly(10,78f);
		ButterFly.printStatic();
		butterFly.printInstance();
		
		ButterFly butterFly1=new ButterFly(11,77f);
		
	}
}

		