public class Checks
{
	public static void main(String[] args)
	{
		int num=153;
		for(int i=1;i<=10;i++)
		{
			
			int rev=0,temp=num,add=0;
			for(int j=num;j>0;j/=10)
			{
				rev=rev*10+(j%10);
			}
			if(temp==rev)
			{
				System.out.println("palindrome "+temp);
				break;
			}
			else
			{
				add=temp+rev;
				num=add;
			}
		}
	
	}
}