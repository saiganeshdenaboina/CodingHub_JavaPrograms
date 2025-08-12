public class Primes
{
	public static void main(String[] args)
	{
		int n=13,count=0,count1=0,rev=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==0)
		{
			for(int i=n;i>0;i/=10)
			{
				rev=rev*10+(i%10);
			}
			for(int i=2;i<=rev/2;i++)
			{
				if(rev%i==0)
					count1++;
			}
			System.out.println(count1==0?"Twist prime":"no Twist prime");
			
		}else
		{
			System.out.println("no prime");
		}
		
	}
}