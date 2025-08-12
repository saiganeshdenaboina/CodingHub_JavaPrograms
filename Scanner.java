import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println("Enter String");
		String s1=sc.next();
		System.out.println("Enter Double value");
		double d=sc.nextDouble();
		char ch=sc.char().nextAt(0);
			System.out.println(num+" "+s1+" "+d);
	}
}