import java.util.Scanner;
class  Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int n=sc.nextInt();
		Evil e=new Evil();
		int result=e.square(n);
		System.out.println(e.check(result,n));
		
	}
}
class Evil
{
	int square(int n)
	{
		int sum=0;
		int num=n*n;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	String check(int sum,int n)
	{
		return sum==n?"Evil":"Not evil";
	}
}