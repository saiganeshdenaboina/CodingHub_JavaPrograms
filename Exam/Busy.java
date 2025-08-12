public class Busy
{
	public static void main(String[] argss)
	{
		int num=129,temp=num;
		while(num>0)
		{
			int rem=num%10;
			num/=10;
			if(rem==7)
			{
				System.out.println("the number is busy");
				break;
			}else
			{
				if(temp%7==0)
					System.out.println("The number is busy number");
				else
					System.out.println("number is not a bsusy number");
					break;
			}
			
		}
	}
}