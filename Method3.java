class Main
{
	void m1()
	{
		System.out.println("no arguments");
	}
	void m2(int x,int y)
	{
		System.out.println("integer parameter");
	}
	void m3(double x)
	{
		System.out.println("double parameter");
	}
	void m4(String x)
	{
		System.out.println("String parameters");
	}
	void m5(char x)
	{
		System.out.println("Character parameter");	
	}
	public static void main(String[] args)
	{
		Main main=new Main();
		main.m5('H');
		main.m2(10,20);
		
	}
}