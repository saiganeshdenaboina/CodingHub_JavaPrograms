import java.util.Scanner;
public class Salary
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the salary:");
		double salary=input.nextDouble();
	
		double da=0.40*salary;
		double ra=0.20*salary;
		double net_sal=salary-(da+ra);


		System.out.println("Dearness Allowance (DA): " + da);
       		System.out.println("House Rent Allowance (HRA): " + ra);
       	        System.out.println("Remaining Salary: " + net_sal);
		input.close();
		
	}
}