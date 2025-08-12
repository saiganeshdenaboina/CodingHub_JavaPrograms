public class Palindrome
{
	public static void main(String[] args)
	{
		int n=100;
		for(int i=1;i<=n;i++)
		{
			int num=i,temp=num,rev=0;
			while(num>0)
			{
				rev=rev*10+(num%10);
				num/=10;	
			}
			if(temp==rev)
			{
				System.out.println(temp);
			}
		}
	}
}