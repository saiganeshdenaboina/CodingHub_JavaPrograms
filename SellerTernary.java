import java.util.Scanner;

public class SellerTernary
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the cost price of item:");
		double cp=input.nextDouble();

		System.out.println("Enter the selling price of item:");
		double sp=input.nextDouble();
		
		System.out.println((sp>cp)?("profit"):((sp<cp)?("loss"):("no profit no loss")));		
	
			
		input.close();
	}
}