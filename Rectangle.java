import java.util.Scanner;
public class Rectangle
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter length:");
		int len = input.nextInt();

		System.out.println("Enter breadth:");
		int bre= input.nextInt();

		double area=len*bre;
		double perimeter=2*(len+bre);
		/*
		if(area>perimeter)
		{
			System.out.println("area is greater than perimeter");
		}else
		{
			System.out.println("area is not g reater than perimeter");
		}
		*/
		System.out.println((area>perimeter)?("area is greater than perimeter"):("area is not greater than perimeter"));
	}

}