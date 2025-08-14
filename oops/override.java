class Parent
{
	static
	{
		System.out.println("satatic method");
	}
	static void m1()
	{
		System.out.println("parent");
	}
}
class  Child extends Parent
{
	static void m1()
	{
		System.out.println("child");
	}
	public static void main(String[] args)
	{
		Parent p=new Child();
		p.m1();
	}
}