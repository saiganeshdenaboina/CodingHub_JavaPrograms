public class Nestpractice
{
	public static void main(String [] args)
	{
		//reverse the nuumbers from 10 to 20 like 12-->21
		/*
		for(int i=10;i<=20;i++)
		{
			int rem=0;
			for(int j=i;j>0;j/=10)
			{
				rem=j%10;
				System.out.print(rem);
			}
			System.out.println();
		}
		*/
		/*
		int n=1;
		for(int i=1;i<=4;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		*/
		/*
		int n=10;
		for(int i=4;i>=1;i--)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}
		*/
		int a=0,b=1,c=0;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
		}



























			
	}
}