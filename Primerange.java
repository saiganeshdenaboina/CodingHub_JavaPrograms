public class Primerange
{
	public static void main(String[] args)
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