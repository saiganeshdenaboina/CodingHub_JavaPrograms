import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num=sc.nextInt();
		Tech t=new Tech();
		int count=t.div(num);
		int sum=t.split(count,num);
		int square=t.square(sum);
		System.out.println(t.result(square,num));
	}
}
class Tech
{
	int div(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	int split(int count,int num)
	{
		int first=num%(int)Math.pow(10,count/2);
		int second=num/(int)Math.pow(10,count/2);
		int sum=first+second;
		return sum;
	}
	int square(int sum)
	{
		int square=sum*sum;
		return square;
	}
	String result(int square,int num)
	{
		return square==num?"Technology":"Not Technology";
	}
	
}