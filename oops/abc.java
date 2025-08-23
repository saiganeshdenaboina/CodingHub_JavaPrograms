interface Parent
{
	public void m1();
	public void m2();
	public void m3();
	public void m4();
	public void m5();

	default void m6()
	{
		System.out.println("default method");
	}
	static void m7()
	{
		System.out.println("static method");
	}
}
abstract class child1 implements Parent
{
	public void m1()
	{
		System.out.println("m1 method from child1");
	}
	public void m2()
	{
		System.out.println("m2 method from child1");
	}
	public void m3()
	{
		System.out.println("m3 method from child1");
	}
}
class child2 extends child1
{
	public void m4()
	{
		System.out.println("m4 method from child2");
	}
	public void m5()
	{
		System.out.println("m5 method from child2");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Parent c=new child2(); 
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		c.m6();
		Parent.m7();
	}
}