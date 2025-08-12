public class Patterns
{
	public static void main(String[] args)
	{
		/*
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=20;j++)
			{
				System.out.println(i+" X "+j+" = "+ (i*j));
			}
			System.out.println();	
		}*/
		
		for(int i=1;i<=100;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}