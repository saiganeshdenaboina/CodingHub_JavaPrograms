public class Factornest
{
	public static void main(String[] args)
	{	
		for(int x=1;x<=1000;x++)
		{
			int count=0,n=x;
			System.out.println("Factors of "+x+" is :");
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					System.out.println(i);		
			}
			System.out.println();
		}
					
	}
}