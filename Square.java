import java.util.Scanner;
public class Square
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num =input.nextInt();
		
		
		double d=Math.sqrt(num);
		System.out.println("square root of "+num+"is : "+d);
		int a=(int)d;
		
		if(d==a)
		{
			System.out.println("Given number is a perfect square");
		}else
		{
			System.out.println("Given number is not a perfect square");
		}
		if(num%3==0)
		{
			if(num%5==0)
			{
				System.out.println("divisible by 3&5");
			}else
			{
				System.out.println("not divisible by 5");
				
			}
		}else
		{

			if(num%2==0)
			{
				System.out.println("number is divisible by 2");
			}else
			{
				System.out.println("number is not diviswible by 3&2");
			}
		}
	}
}