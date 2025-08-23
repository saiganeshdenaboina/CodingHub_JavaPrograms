abstract class parent
{
	public abstract void m1();

	public static void main(String[] args)
	{
		parent p=new parent()
		{
		public void m1()
		{
			System.out.println("parent method");
		
		}
		};
		p.m1();
	}
}