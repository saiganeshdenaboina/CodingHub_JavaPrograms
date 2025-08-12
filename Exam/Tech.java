public class Tech
{
	public static void main(String[] args)
	{
		int num=2025,count=0,sum=0,temp=num,first=0,second=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		first=temp%(int)Math.pow(10,count/2);
		second=temp/(int)Math.pow(10,count/2);
		sum=first+second;
		int result=(int)Math.pow(sum,2);
		if(result==temp)
			System.out.println("Technology number");
		else
			System.out.println("Not a technology number");

	}
}