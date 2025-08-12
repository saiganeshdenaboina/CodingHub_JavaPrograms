public class Largest
{
	public static void main(String[] args)
	{
		int num=28293,max=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem>max)
				max=rem;
			num/=10;
		}
		System.out.println(max);
	}
}