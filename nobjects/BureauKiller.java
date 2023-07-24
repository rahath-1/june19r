class BureauKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in BureauKiller");
		
		Bureau bureau=new Bureau(25,3500d);
		Bureau.printStatic();
		bureau.printInstance();
		
		System.out.println("\n");
		
		Bureau bureau1=new Bureau(30,4000d);
		Bureau.printStatic();
		bureau.printInstance();
		System.out.println(bureau1.employeeAge);
		System.out.println(bureau1.employeeSalary);
		
	}
}