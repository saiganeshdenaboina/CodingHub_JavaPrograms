import java.util.Scanner;
class Ternary
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter 3 numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		System.out.println((num1>num2)?((num1>num3)?(num1+" is greater"):(num3+" is greater")):((num2>num3)?(num2+" is greater"):(num3+"is greater")));
	}
}