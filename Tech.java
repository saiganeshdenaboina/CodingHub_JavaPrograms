public class Tech
{
	public static void main(String[] args)
	{
		int num=2025,count=0,sum=0,temp=num;
		while(num>0)
		{
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}