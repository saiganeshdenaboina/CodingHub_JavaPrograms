import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int n=sc.nextInt();
		
		Inav i=new Inav();
		int result=i.m1(n);
		System.out.println(i.m2(result));
	}
}
class Inav
{
	int m1(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	String m2(int n)
	{
		int sum=m1(n);
		while(sum>9)
		{
			sum=m1(sum);
		}
		return sum==1?"Inav Number":"Not Inav Number";
	}
	
}