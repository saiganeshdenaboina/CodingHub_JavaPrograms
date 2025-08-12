class Main
{
	public static void main(String[] args)
	{
		Multiple m=new Multiple();
		m.n=10;
		for(int i=1;i<=m.n;i++)
		{
			m.mul(i);
			System.out.println();
		}
	}
}
class Multiple
{
	int n;
	void mul(int n)
	{
		for(int j=1;j<=20;j++)
			System.out.println(n+" X "+j+" = "+(n*j));	
	}
	
}