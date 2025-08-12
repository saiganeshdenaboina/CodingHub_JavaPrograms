public class Auto
{
	public static void main(String[] args)
	{
		int num=76,sum=0,temp=num,count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		sum=(int)Math.pow(num,count);
		while(sum>0)
		{
			int rem=sum%100;
			if(rem==num)
			{
				System.out.println(rem+" Automatic Number");
				break;
			}
			sum/=10;
		}
		
	
	}
}