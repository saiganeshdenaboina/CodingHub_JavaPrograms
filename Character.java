import java.util.Scanner;
public class Character
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=input.next().charAt(0);
		/*
		if(ch >='A'&& ch <='Z')
			System.out.println("capital letter");
		else if(ch>='a' && ch<='z')
			System.out.println("Small letter");
		else if(ch>='0'&& ch<='9')
			System.out.println("digits");
		else
			System.out.println("special symbols");
		*/

		System.out.println((ch >='A'&& ch <='Z')?("capital"):((ch>='a' && ch<='z')?("Small"):((ch>='0'&& ch<='9')?("digits"):("Special Symbols"))));
	}
}