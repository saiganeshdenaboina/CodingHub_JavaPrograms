class Parent
{
	void m1()
	{
		System.out.println("parent m1");
	}
	void m2()
	{
		System.out.println("parent m2");
	}
	void m4()
	{
		System.out.println("parent m4");
	}
}
class Child extends Parent
{
	void m2()
	{
		System.out.println("child m2");
	}
	void m3()
	{
		System.out.println("child m3");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Child c=new Child();
		Parent p=new Child();
		p.m1();
		p.m2();//override the parent class and it gives the child class output
		p.m4();
		//incase any method is not there in the parent class but we call it, compile time it gives an  error like "cannot find symbol"
	}
}