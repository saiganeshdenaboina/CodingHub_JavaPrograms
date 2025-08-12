public class Fibnoci
{
	public static void main(String[] args)
	{
		int num=25378;
		while(num>0)
		{
			int rem=num%10;
			int a=0,b=1,c=0;
			for(int i=1;i<=rem;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}					
			System.out.println(rem+"th Element of the series : "+a);                    
			num/=10;
		}
	}
	
}