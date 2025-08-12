public class Adding
{
	public static void main(String[] args)
	{
		int n=10,a=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
					System.out.println(i+"Even factor");
				else
					System.out.println(i+"is odd factor");	
			}
		}		
	}
}
