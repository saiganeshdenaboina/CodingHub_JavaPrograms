import java.util.Scanner;

public class Conditions
{
	public static void main(String[] args)
	{
		int num1,num2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of num1:");
		num1=input.nextInt();
		System.out.println("Enter the value of num2:");
		num2=input.nextInt();
		if(num1<num2)
		{
			System.out.println("num1 is less than num2");
		}else
		{
			System.out.println("num1 is greater than num2");
		}
	}
}