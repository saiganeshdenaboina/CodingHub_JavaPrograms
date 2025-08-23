interface A
{
	public void m1();
}
class B  
{
	public void m2()
	{
		System.out.println("m2 method");
	}
}
class C extends B implements A
{
	public void m1()
	{
		System.out.println("m1 method in child");
	}
}
class Main
{
	public static void main(String[] args)
	{
		C c = new C();
		c.m1();	
		c.m2();
	}
}