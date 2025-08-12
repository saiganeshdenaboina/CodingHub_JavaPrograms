import java.util.Scanner;
public class Basic
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		/*
		for(int i=1;i<=10;i++)
			System.out.println("Coding Hub");
		*/
		/*
		for(int i=1;i<=100;i++)
	
			System.out.println("java"+"\n"+"Programming");
		*/
	
		//forward iteration
		/*
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;	
		
		}System.out.println(fact);
		*/
		//backward iteration
		/*
		for(int i=n;i>=1;i--)
			fact*=i;
		System.out.println(fact);
		*/
		/*
		for(int i=2;i<=n;i++)
		{
			boolean isprime=true;

			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime = false;
					break;		
				}
			}
			if(isprime)
				System.out.println(i+" is prime");
		}
		*/
		/*
		for(int i=1;i<=n;i++)
			System.out.println("29 * "+i+" = " + n*i);
		*/
		/*
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		*/
		/*
		int rev=0;
		for(;n!=0;n/=10)
		{
	
			rev=rev*10+(n%10);
		}System.out.println(rev);
		*/
		/*
		int rev=0,a=n;
		for(;n>0;n/=10)
		{
			rev=rev*10+(n%10);
		}
		if(a==rev)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		*/
		/*
		int rev=0,a=n,sum=0,count=0;
		for(;n>0;n/=10)
		{
	
			int rem=n%10;
			sum+=(Math.pow(rem,3));
		}
		System.out.println((a==sum)?("armstrong"):("not a armstrong"));
		*/
		/*
		int n=20,count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		System.out.println(count==0?"prime":"not a prime");
		*/

		int n=36,count=0;
		for(int i=2;i<=20;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" Smallest factor for "+n);
				break;
			}			
		}
		for(int i=n/2;i>=1;i--)
		{
			if(n%i==0)
			{

				count++;
				if(count==2)
				{	
				 System.out.println(i+"Sceond highest factor for "+n);
				 break;
				}
			}
		}
		

		






























		


		
				
		





	}
}