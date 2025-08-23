abstract class parent
{
	parent()
	{
		System.out.println("parent constructor");
	}
}
class child extends parent
{
	child()
	{
		System.out.println("child constructor");
	}
	public static void main(String[] args)
	{
		child c=new child();
	}
}
	