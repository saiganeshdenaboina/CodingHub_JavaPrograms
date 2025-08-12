import java.util.Scanner;
public class Buzz
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=input.nextInt();
		
		System.out.println((num%3==0&&num%5==0)?("fizbuzz"):((num%3==0||num%5==0)?("fizz"):((num%3!=0&&num%5!=0)?("buzz"):("invalid "))));
	}
}