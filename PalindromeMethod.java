class Main
{
	public static void main(String[] args)
	{
		Palindrome p=new Palindrome();
		p.num=200;
		for(int i=1;i<=p.num;i++)
		{
			int result=p.checkpal(i);
			if(result==i)
				System.out.println(i);
		}
	}
}
class Palindrome
{
	int num;
	int checkpal(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	
}