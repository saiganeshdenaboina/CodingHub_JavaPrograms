public class Nesteds
{
	public static void main(String[] args)
	{	int count=0;
		for(int x=1;x<=1000;x++)
		{
			int num=x,rev=0,temp=num;
			while(num>0)
			{
				rev=rev*10+(num%10);
				num/=10;
			}
			if(temp==rev)
			{
				count++;
				System.out.println(x+" is a palindrome");
			}
		}
		System.out.println(count+" count ");
	}
}