import java.util.Scanner;

public class Seller
{

 
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the cost price of item:");
		double cp=input.nextDouble();

		System.out.println("Enter the selling price of item:");
		double sp=input.nextDouble();
		double profit=sp-cp;
		double loss=cp-sp;


		/*
		if(sp>cp)
		{	
			double profit=sp-cp;
			System.out.println("seller made a profit of"+profit);
		}else if(sp<cp)
		{
			double loss=cp-sp;
			System.out.println("seller incurred a loss of"+loss);
		}else
		{
			System.out.println("seller did not gain any profit or loss");
		}
		
		*/
		System.out.println((sp>cp)?("profit "+profit):((sp<cp)?("loss " +loss):("no profit no loss")));	
			
		input.close();
	}
}