public class Objects
{
	public static void main(String[] args)
	{
		Sample Sample1=new Sample();
		Sample1.display();
		Sai Sample2=new Sai();
		Sample2.ganesh();
		Sample1.display();
	}
}
class Sample
{
	void display()
	{
		int n=5;
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
	}
}
class Sai
{
	void ganesh()
	{
		int n=-4;
		System.out.println(n>0?"positive":"negative");	
	}
}