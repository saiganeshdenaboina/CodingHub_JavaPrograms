class Main
{
	public static void main(String[] args)
	{
		dog d=new dog("jully","black");
			d.print();
	}
}
class Animal
{
	String name;
	String colour;
	void print()
	{
		System.out.println(name+" "+colour);
	}
}
class dog extends Animal
{
}
