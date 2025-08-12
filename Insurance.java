import java.util.Scanner;

public class Insurance
{
	public static void main(String[] args)
	{
		double premium=0;

		int maxamount=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter person's health condition (excellent/poor) : ");
		String health=input.nextLine();

		System.out.println("Enter person's Age : ");
		int age=input.nextInt();
		input.nextLine();

		System.out.println("Enter person's area(city/village) : ");
		String area=input.nextLine();

		System.out.println("Enter person's Gender : ");
		String gender=input.nextLine();

		if(health.equalsIgnoreCase("excellent")&&age>=25&&age<=35&&area.equalsIgnoreCase("city")&&gender.equalsIgnoreCase("male"))
		{
			premium=4;
			maxamount=200000;
			System.out.println("premium is "+premium+" per thousand and maxmium amoumt exceed is "+maxamount);
			
		}else if(health.equalsIgnoreCase("excellent")&&age>=25&&age<=35&&area.equalsIgnoreCase("city")&&gender.equalsIgnoreCase("female"))
		{
			premium=3;
			maxamount=100000;
			System.out.println("premium is "+premium+" per thousand and maxmium amoumt exceed is "+maxamount);

		}else if(health.equalsIgnoreCase("poor")&&age>=25&&age<=35&&area.equalsIgnoreCase("village")&&gender.equalsIgnoreCase("male"))
		{
			premium=6;
			maxamount=10000;
			System.out.println("premium is "+premium+" per thousand and maxmium amoumt exceed is "+maxamount);
		}else
		{
			System.out.println("not secured");
		}
		System.out.println("Health : "+health);
		System.out.println("Premium Rate : "+premium);
		System.out.println("Maximum Amount : "+maxamount);
	}
}