class Main
{
	public static void main(String[] args)
	{
		try
		{
			m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch block");
		}
		finally
		{
			System.out.println("in the final block");
		}
	}
	public static void m2()
	{
		m3();
	}
	public static void m3()
	{
		System.out.println(10/0);
	}
	
}