class Main
{
	public static void main(String[] args)
	{
		int n=7;
		Prime p=new Prime();
		p.calPrime(n);
	}
}
class Prime
{
	int calPrime(int n)
	{
		int i;
		for(i=1;i<=n;i++)
		{
			int factor=0;
			for(int j=i;j<=i;j++)
			{
				if(i%j==0)
					factor++;
			}
			if(factor==2)
				System.out.println(i);
		}
		return i;
	}
	
}