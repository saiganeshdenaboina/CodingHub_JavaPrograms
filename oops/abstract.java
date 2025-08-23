abstract class Parent
{
	public void m1()
	{
		System.out.println("m1 method ");
	}
	public abstract void m2();
}
class Child extends Parent
{
	@override
	public void m2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
		c.m2();
	}
}