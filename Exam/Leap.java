public class Leap
{
	public static void main(String[] args)
	{
		int n=2030;
		for(int i=2000;i<=n;i++)
		{
			int year=i;
			if((year%4==0 && year%100!=0) || year%400==0)
				System.out.println(year);
		}
	}
}