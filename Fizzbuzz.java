import java.util.Scanner;
public class Fizzbuzz
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=input.nextInt();
		/*
		if(num%3==0 && num%5==0)
		{
			System.out.println("fizzbuzz");
		}else if(num%3==0 || num%5==0)
		{
			System.out.println("fizz");
		}else if(num%3 !=0 && num%5 != 0)
		{
			System.out.println("buzz");
		}else
		{
			System.out.println("invalid number");
		}
		*/
		System.out.println((num%3==0&&num%5==0)?("fizbuzz"):((num%3==0||num%5==0)?("fizz"):((num%3!=0&&num%5!=0)?("buzz"):("invalid "))));

		input.close();

	}
}