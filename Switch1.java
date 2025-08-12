public class Switch1
{
	public static void main(String[] args)
	{
		/*
		int days=10;
		switch(days)
		{
			case 1: System.out.println("Monday");break;
			case 2: System.out.println("Tuesday");break;
			case 3:	System.out.println("Wednesday");break;
			case 4:	System.out.println("Thursday");break;
			case 5:	System.out.println("Friday");break;
			case 6:	System.out.println("Saturday");break;
			case 7: System.out.println("Sunday");break;
			default: System.out.println("Invalid");

		}
		*/
		//calculator using switch
		 char operator='%';
		 int a=2,b=10;
		switch(operator)
		{
			case '+':System.out.println(a+b); break;
			case '-':System.out.println(a-b); break;
			case '*':System.out.println(a*b); break;
			case '/':System.out.println(a/b); break;
			case '%':System.out.println(a%b); break;
			default: System.out.println("ERROR");
			
		}
	}
}