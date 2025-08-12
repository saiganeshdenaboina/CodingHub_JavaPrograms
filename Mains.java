public class Mains
{
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		cal.Add();
		cal.Sub();
		cal.Mul();
		cal.Div();
		cal.Mod();
	
	}
}
class Calculator
{
	void Add()
	{
		int a=10,b=15;
		System.out.println(a+b);
	}
	void Sub()
	{
		int a=10,b=15;
		System.out.println(a-b);

	}
	void Mul()
	{	
		int a=10,b=15;
		System.out.println(a*b);

	}
	void Div()
	{
		int a=10,b=15;
		System.out.println(a/b);
	
	}
	void Mod()
	{
		int a=10,b=15;
		System.out.println(a%b);

	}
}