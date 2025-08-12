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
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Main main=new Main();
		int n=sc.nextInt();
		int result=main.calPalindrome(n);
		System.out.println(result==n?"Palindrome":"Not Palindrome");	
	}
}