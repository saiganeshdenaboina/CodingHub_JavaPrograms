import java.util.Scanner;
public class Library
{
	public static void main(String[] args)
	{
		double fine=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of days");
		int days=input.nextInt();
		/*
		if(days<=5 )
		{
			fine= days *0.50;
			System.out.println("fine amount for "+days+" days is:"+fine);
		}else if(days<=10)
		{
			fine= days*1.00;
			System.out.println("fine amount for "+days+" days is:"+fine);
		}else if(days<=30)
		{
			fine= days*5.00;
			System.out.println("fine amount for "+days+" days is:"+fine);
		}else
		{
			System.out.println("Your membership will be cancelled");
		}
		*/

		System.out.println((days<=5)?(fine=days*0.50):((days<=10)?(fine=days*1.00):((days<=30)?(fine=days*5.00):("membership cancelled"))));
		System.out.println("fine amount for "+days+" days is:"+fine);
		
		input.close();
	}
}

