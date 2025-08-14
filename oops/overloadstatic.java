class Main
{
	static void m1(int x,String s)
	{
		System.out.println(x+"  "+s);
	}
	static void m1(String s,int x)
	{
		System.out.println(s+"  "+x);
	}
	public static void main(String[] args)
	{
		//Main m=new Main();
		Main.m1(1,"sai");
		//Main m2=new Main();
		Main.m1(2,"ganesh");
	}
}