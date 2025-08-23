interface Parent
{
	public void m1();
	public String m2();
	public int m3();
	public char m4();
}
class Child implements Parent
{
	@Override
	public void m1()
	{
		System.out.println("me method");
	}
	@Override	
	public int m3()
	{
		return 20;
	}
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
		System.out.println(c.m3());
	}
}