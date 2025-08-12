public class Power
{
	public static void main(String[] args)
	{
		int num=217,sum=0,product=1;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num/=10;
		}
		System.out.println((sum==product)?"Power Number":"Not a POwer Number");
	}
}