interface Parent1
{
	public void m1();
}
interface Parent2
{
	public void m2();
}
class Child implements Parent1,Parent2
{
	@Override
	public void m1()
	{
		System.out.println("m1 method");
	}
	@Override
	public void m2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();c.m2();
	}
}