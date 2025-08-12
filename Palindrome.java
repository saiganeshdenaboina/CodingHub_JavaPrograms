import java.util.Scanner;
class Main
{
	int calPalindrome(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}	
		return rev;
	}
	int calPrime(int num)
	{
		int factor=0;
		for(int i=1;i<=num;i++)
		{
			if(n%i==0)
				factot++;
		}	
		return factor;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Main main=new Main();
		int n=sc.nextInt();
		int result=main.calPalindrome(n);
		System.out.println(result==n?"Palindrome":"Not Palindrome");
		int n1=sc.nextInt();
		int final=main.calPrime(n1);
		System.out.println(factore==2?"p":"n");	
	}
}