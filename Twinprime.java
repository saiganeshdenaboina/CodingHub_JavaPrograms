public class Twinprime
{
	public static void main(String[] args)
	{
		int n=7,count=0,count1=0,sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;	
		}	
		if(count==2)
		{
			sum=n+2;
			for(int i=2;i<=sum/2;i++)
			{
				if(sum%i==0)
					count1++;
			}
			System.out.println(count1==0?"Twin prime":"Not twin prime");
		}
		else
		{
			System.out.println("no prime");	
		}
	}
}