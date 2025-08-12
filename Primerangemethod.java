import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range number :");
		int n=sc.nextInt();

		Prime p=new Prime();
		p.check(n);
	}
}
class Prime
{
	void  check(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int factor=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					factor++;
			}
			if(factor==2)
				System.out.println(i);
		}
	}
}