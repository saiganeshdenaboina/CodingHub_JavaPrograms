import java.util.Scanner;

public class Leapyear
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter year : ");
		int year=input.nextInt();
		System.out.println((year%4==0 && year%100!= 0)||(year%400==0)?(year+" is leap year"):(year+" is not a leap year"));
		input.close();
	}

}