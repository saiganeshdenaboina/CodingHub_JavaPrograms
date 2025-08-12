import java.util.Scanner;
/*class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Practice p=new Practice();
		System.out.println(p.calnum(n));
			
	}
}
class Practice
{
	int calnum(int num)
	{
		int even=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				even=rem;
			num/=10;
		}
		return even;
	}
	
}
*/

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		fibnoci f=new fibnoci();
		f.m1(n);
	}
}
class fibnoci
{
	int m1(int n)
	{
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
		return a;
		
	}
}






















