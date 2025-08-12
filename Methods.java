class Main
{
	public static void main(String[] args)
	{
		Main main=new Main();
		main.Factor();
		main.Even();
		Second s=new Second();
		s.Prime();
		s.posneg();
		s.palindrome();
	
	}
	void Factor()
	{
		int a=20;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				System.out.println(i);
		}
		
	}
	void Even()
	{
		int i=19;
		System.out.println(i%2==0?"even":"odd");
	}

}
class Second
{
	void Prime()
	{
		int n=8,factor=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				factor++;
		}
		System.out.println(factor==2?"prime":"not prime");
	}
	void posneg()
	{
		int a=6;
		System.out.println(a>0?"positive":"negative");
	}
	void palindrome()
	{
		int n=5,countprime=0;
		for(int i=1;i<=200;i++)
		{
			int count2=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count2++;
			}
			if(count2==2)
			{
				countprime++;
			}
			if(countprime==n)
			{
			
				System.out.println(i);
				break;
			}
		}

	}
}