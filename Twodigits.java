public class Twodigits
{
	public static void main(String[] args)
	{/*
		int num=90369865;
		while(num>0)
		{
			int rem=num%100;
			char ch=(char)rem;
			System.out.println(rem+" --> "+ch);
			num/=100;	
		}
		*/
		int num=1634,temp=num,rev=0,sum=0,count=0;
		while(num>0)
		{
			count++;
			rev=rev*10+(num%10);
			num/=10;
		}
		num=temp;
		if(num%2==0)
		{
			if(temp==rev)
				System.out.println("palaindrome");
			else
				System.out.println("not a palindrome");		
		}
		else
		{
			while(rev>0)
			{
				int rem=rev%10;
				sum=sum+(int)Math.pow(rem,count);
				rev/=10;
			}
			if(temp==sum)
				System.out.println("Armstrong");
			else
				System.out.println("Not a Armstrong");

		}	


	}
}
