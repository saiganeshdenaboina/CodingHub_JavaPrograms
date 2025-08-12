class Main
{
	public static void main(String[] args)
	{
		int num=64790000,rev1=0,rev2=0,count1=0,count2=0;
		for(int i=num;i>0;i/=10)
		{
			count1++;
			rev1=rev1*10+(i%10);
		}			
		for(int i=rev1;i>0;i/=10)
		{
			count2++;
			switch(rev1%10)
			{
				case 1 -> System.out.print("One");
				case 2 -> System.out.print("Two");
				case 3 -> System.out.print("Three");
				case 4 -> System.out.print("Four");
				case 5 -> System.out.print("Five");
				case 6 -> System.out.print("Six");
				case 7 -> System.out.print("Seven");
				case 8 -> System.out.print("Eight");
				case 9 -> System.out.print("Nine");
			}System.out.print(" ");
			rev1/=10;
		}
		int diff=count1-count2;
		for(int i=1;i<=diff;i++)
		{
			System.out.print("Zero " );
		}

		/*
		int original=rev2*(int)Math.pow(10,diff);

		String str=String.valueOf(original);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			switch(ch)
			{
				case '0': System.out.println("Zero"); break;
                		case '1': System.out.println("One"); break;
                		case '2': System.out.println("Two"); break;
                		case '3': System.out.println("Three"); break;
                		case '4': System.out.println("Four"); break;
                		case '5': System.out.println("Five"); break;
                		case '6': System.out.println("Six"); break;
                		case '7': System.out.println("Seven"); break;
                		case '8': System.out.println("Eight"); break;
                		case '9': System.out.println("Nine"); break;					}
		}
			*/







	}
}
