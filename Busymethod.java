import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int n=sc.nextInt();
	
		Busy b=new Busy();
		System.out.println(b.check(n));
	}
}
class Busy
{
	String check(int n)
	{
		int rem=n%10;
		if(rem==7 || n%7==0)
			return"Busy Number";
		else
			return"Not Busy Number";
	}
}