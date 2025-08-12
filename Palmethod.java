import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Range Number : ");
		int n=sc.nextInt();

		Palindrome p=new Palindrome();
		p.reverse(n);
	}
}
class Palindrome
{
	void  reverse(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int num=i, rev=0,temp=num;
			while(num>0)
			{
				rev=rev*10+(num%10);
				num/=10;
			}
			if(temp==rev)
				System.out.println(i);
		}
	}
}