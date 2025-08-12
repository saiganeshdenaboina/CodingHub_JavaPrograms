import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int n=sc.nextInt();
		Arm a=new Arm();
		for(int i=1;i<=n;i++)
		{
			int count=a.digits(i);
			int sum=a.sums(count,i);
			if(a.check(sum,i))
				System.out.println(i);
		}
	}
}
class Arm
{

	int digits(int i)
	{
		int count=0;
		while(i>0)
		{
			count++;
			i/=10;
		}
		return count;
	}
	int sums(int count,int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=(int)Math.pow(n%10,count);
			n/=10;
		}
		return sum;
	}
	boolean check(int sum,int i)
	{
		return sum==i;
	}

}