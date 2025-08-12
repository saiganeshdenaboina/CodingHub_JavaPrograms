import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number :");
		int n=sc.nextInt();
		Auto a=new Auto();
		int result=a.check(n);	
		System.out.println(a.m1(result,n));
	}
}
class Auto
{
	int check(int n)
	{
		int res=0;
		int num=n*n;
		while(num>0)
		{
			res=num%100;
			num/=10;
			break;
		}
		return res;
	}
	String m1(int res,int n)
	{
		return res==n?"Automatic":"Not Automatic";
	}
}
	