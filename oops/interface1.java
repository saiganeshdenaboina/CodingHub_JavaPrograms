interface parent
{
	public static void m1()
	{
		System.out.println("static method");
	}
}
class Child 
{
	public static void main(String[] args)
	{
		parent.m1();
	}
}