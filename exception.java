class Exception
{
	public static void m1(int x,int y)
	{
		try
		{
			int n=x/y;
			System.out.println(n);
		}catch(ArithmeticException a)
		{
			System.out.println("im a arthimetic exception");
		}
	}
	public static void m2(int[] a)
	{	
		try
		{
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
				System.out.println("Arrayindexoutofbounds exception");
		}
	}
	public static void m3(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Exception e=new Exception();
		m1(10,0);
		int[] a={1,2,3};
		m2(a);
		m3("sai ganesh");
	}
}