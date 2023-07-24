class CandleKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in CandleKiller");
		
		Candle candle=new Candle(15f,100d);
		
		candle.printInstance();
		
		System.out.println("\n");
		
		Candle candle1=new Candle(20f,30d);
		Candle.printStatic();
		candle.printInstance();
		System.out.println(candle1.height);
		System.out.println(candle1.price);
		
	}
}