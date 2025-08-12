import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		Armstrong a=new Armstrong();
		int result =a.m1(n);
		int n1=a.m2(n,result);
		System.out.println(a.m3(n1,n));
		
	}
}
class Armstrong
{
	int m1(int num)
	{
		int count=0,copy=num;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int m2(int copy,int count)
	{
		int sum=0;
		while(copy>0)
		{
			sum+=(int)Math.pow(copy%10,count);
			copy/=10;
		}
		return sum;
	}
	String m3(int sum,int num)
	{
		return sum==num?"Armstrong":"Not Armstrong";
	}
}