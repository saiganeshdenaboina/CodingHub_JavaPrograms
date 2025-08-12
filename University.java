import java.util.Scanner;
public class University
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter percentagte in A : ");
		double A_percentage=input.nextDouble();

		System.out.println("Enter percentage in B :");
		double B_percentage=input.nextDouble();
		/*
		if((A_percentage>=55 && B_percentage>=45)||(A_percentage >=45 && A_percentage<55 &&B_percentage>=55))
		{
			System.out.println("pass");
		}else if(A_percentage>=65 && B_percentage<45)
		{
			System.out.println("Reappear in B");
		}else
		{
			System.out.println("Fail");
		}
		*/
		System.out.println(((A_percentage>=55 && B_percentage>=45)||(A_percentage >=45 && A_percentage<55 &&B_percentage>=55))?("pass"):((A_percentage>=65 && B_percentage<45)?("reappear in B"):("fail")));
		
		input.close();
	}
}