public class Multiplication
{
	public static void main(String[] args)
	{
		/*
		 int x=7;
		for(int i=7;i<=100;i++)
		{
			
			System.out.println(x+" x "+i+" = "+x*i);
			
		}
			*/
		//sum of first natural numbers
		/*
		int x=0;
		for(int i=0;i<=10;i++)
		{
			x+=i;
			
		}System.out.println(x);
		*/
		//print even numbers from 1 to 50
		/*
		for(int i=2;i<=50;i=i+2)
			System.out.println(i);
		*/
		//print numbers from 100 down to 1
		/*
		int count=0;
		for( int i=1985;i<=2025;i++)
		{
			count++;
			System.out.println(i);
		}System.out.println("Count is : "+count);
			*/
		/*
		//febinous series
		int a=0,b=1;
		System.out.println(a);
		for(int i=0;i<10;i++)
		{
			System.out.println(b);
			int next = a+b;
			a=b;
			b=next;	
		}*/
		/*
		
		int n1=24,n2=36;
		int min=Math.min(24,36);
		for(int i=1;i<=min;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println("Common Factors of "+n1+" and "+n2+" is :"+i);		
				
			}
		}
		*/
		/*
		int n=123,rev=0,a=n,count=0;
		for(;n>0;n/=10)
		{
			rev=rev*10+(n%10);
			
		}
		if(a==rev)
		{
			System.out.println("palindrome");
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}	
			}
			System.out.println(count==0?"prime number":"not a prime number");
		
		}
		else
			System.out.println(" not a palindrome");
		

		
		for(int i=1;i<=10;i++)
		{
			double d=Math.sqrt(i);
			if(d==(int)d)
				System.out.println(i);
		}
		*/
		//check a number is palindrome or not if palindrome check the same number is armstrong or not
		/*
		int a=1,rev=0,count=0,sum=0;
		for(int n=a;n>0;n/=10)
		{
			count++;
			rev=rev*10+(n%10);
		}
		if(a==rev)
		{
			System.out.println("palindrome");
			for(int j=a;j>0;j/=10)
			{
			 sum+=Math.pow(j%10,count);
			}
			if(sum==a)
				System.out.println("Armstrong");
			else
				System.out.println("not a armstrong");
		}
		else
			System.out.println("not a palindrome");
		*/

		


		




































	}
}