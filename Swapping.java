import java.util.Scanner;
class Swapping
{
	public static void main(String [] args)
	{
		int c,d,e;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter c:");
		 c=input.nextInt();
		
		System.out.println("Enter D:");
		 d=input.nextInt();
		
		e=c;  //using external variable
		c=d;
		d=e;
		System.out.println(e);
		
		
		
	}
}