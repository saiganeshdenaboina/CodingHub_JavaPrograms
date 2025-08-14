/*class Main
{
	int x=10;
	static int y=20;
	String m1()
	{
		return "sai ganesh";
	}
	static char m2()
	{
		return 'A';
	}
	public static void main(String[] args)
	{
		Main m=new Main();//object creation for instatnce variables and methods 
		System.out.println(m.x);
		System.out.println(m.m1());
		//static variables and methods in the same class we cant use class name  
		System.out.println(y);
		System.out.println(m2());
	}
}
*/
class Main
{
	static 
	{
		System.out.println("Static block1");
	}
	static 
	{
		System.out.println("Static block2");
	}
	{
		System.out.println("instance block");
	}
	public static void main(String[] args)
	{
		Main m=new Main();
		System.out.println("inside main method");
	}
}