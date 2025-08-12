public class Men	
{
	public static void main(String[] args)
	{
		int n=633;
		for(int i=1;i<=100;i++)
		{
			if(n%2==0)
				n=n/2;
			else
				n=3*n+1;
		if(n==1)
		{
			System.out.println("Reached 1 at "+i+" iteration");
			break;
		}
		}
		
	}
}