class Bureau{
	
	static String employeeName;
	static String employeeAddress;
	int employeeAge;
	double employeeSalary;


    Bureau(int employeeAge,double employeeSalary)   
	{
		this.employeeAge=employeeAge;
		this.employeeSalary=employeeSalary;
		System.out.println("invocking int, double in Bureau");
		System.out.println("\n");
	}	
	
	static {                           
		employeeName="Santhosh";
		employeeAddress="Vijaynagara";
		System.out.println("invocking static block in Bureau");
		System.out.println("\n");
	}
	
	static void printStatic()            
	{
        System.out.println("Running printStatic block in Bureau");
		System.out.println(employeeName);
		System.out.println(employeeAddress);
		System.out.println("\n");
	}
	
	void printInstance()                   
	{
		System.out.println("Running printInstance block in Bureau");
		System.out.println(this.employeeAge);
		System.out.println(this.employeeSalary);
	}
}