import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Prime p=new Prime();
		int result=p.checkPrime(n);
		System.out.println(p.isPrime(result));
	}
}
class Prime
{
	int checkPrime(int n)
	{	
		int factor=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				factor++;
		}
		return factor;
	}
	String isPrime(int result)
	{
		return result==2?"Prime":"Not Prime";
	}
}