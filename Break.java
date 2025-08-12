public class Break
{
	public static void main(String[] args)
	{
		/*
		for(int i=5;i<20;i++)
		{
			System.out.println(i);

			if(i>15)
			{
				System.out.println("continue");
				 continue;
			}
		}
		*/
		/*
		int num1=100,count=0;
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				count++;
				System.out.println(i+" is factor of "+num1);
			}
		}
		System.out.println("count is "+count);
		*/
		/*
		int n=7;
		for(int i=1;i<=20;i++)
		{
			int result=n*i;
			if(result%2==0)
				System.out.println("7 X "+i+" ="+result);
		}
		*/
		int n = 18,count=0;
                boolean isPrime = true;

		for (int i = 2; i <= n / 2; i++) 
		{
    			if (n % i == 0) 
			{
				count++;
        			isPrime = false;
        			break;
    			}
		}
		System.out.println(count);
		System.out.println(isPrime ? "prime" : "not prime");



	}
}