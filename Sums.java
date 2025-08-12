public class Sums
{
	public static void main(String[] args)
	{
		int num=132468,count=0,rev=0,temp=num;
		while(num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
			count++;	
		}
		for(int i=1;i<=count/2;i++)
		{
			int left=temp%10;
			int right=rev%10;
			System.out.println(left+right);
			temp/=10;
			rev/=10;
		}

		if(count%2!=0)
			System.out.println(temp%10);
	}
	
}