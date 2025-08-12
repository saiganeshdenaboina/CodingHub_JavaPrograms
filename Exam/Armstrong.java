public class Armstrong
{
	public static void main(String[] args)
	{
		int n=1000;
		for(int i=1;i<=n;i++)
		{
			int num=i,count=0,temp=num,sum=0;
			while(num>0)
			{
				count++;
				num/=10;
			}
			num=temp;
			while(num>0)
			{
				sum+=Math.pow(num%10,count);
				num/=10;
			}
			if(sum==temp)
				System.out.println(temp);
		}
	}
}
