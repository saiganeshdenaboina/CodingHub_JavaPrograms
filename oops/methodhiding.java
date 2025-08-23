class Parent
{
	static void hiding()
	{
		System.out.println("static method");
	}
	void override()
	{
		System.out.println("override method");
	}	
}
class Child extends Parent
{
	static void hiding()
	{
		System.out.println("child method");
	}
	@Override
	void override()
	{

		System.out.println("child override method");
	}	
}
class Main
{
	public static void main(String[] args)
	{
		Child c= new Child();
		c.hiding();
		c.override();
		
		Parent p=new Child();
		p.hiding();
		p.override();
	}
}