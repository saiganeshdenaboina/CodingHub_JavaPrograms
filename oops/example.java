class Parent
{
	int a;
	void m1(int a)
	{
		this.a=a;
		System.out.println(a);
	}
}
class Child extends Parent
{
	void m2()
	{
		System.out.println("child"+(a+this.a));
	}
}
class Main
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1(10);
		c.m2();
	}
}