import java.util.Scanner;

public class Evenodd
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of num: ");
		int num=input.nextInt();
               /*
		if(num%2==0)
		{
			System.out.println("Given number is an Even number");
		}else
		{
			System.out.println("Given number is an Odd number");
		}
		*/
		System.out.println((num%2==0)?("even"):("odd"));
		input.close();
	
	}
}