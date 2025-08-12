import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int n=sc.nextInt();
		Power p=new Power();
		int[] result=p.checkpower(n);
		System.out.println(p.check(result[0],result[1]));
	}
}
class Power
{
	int[] checkpower(int n)
	{
		int sum=0,product=1;
		while(n>0)
		{
			sum+=n%10;
			product*=n%10;
			n/=10;
		}
		return new int[]{sum,product};
	}
	String check(int sum,int product)
	{
		return sum==product?"Power":"not power";
	}
}