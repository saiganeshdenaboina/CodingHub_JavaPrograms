class  Main
{
	void m1(byte x)
	{
		System.out.println("byte "+x);
	}
	void m1(float x)
	{
		System.out.println("float "+x);
	}
	public static void main(String[] args)
	{
		double y=54.654;
		Main m=new Main();
		m.m1((int)y);
	}
}