public class Switch
{
	public static void main(String[] args)
	{
        	int num = 12459,rev = 0,temp = num;

        	while(num != 0) 
		{
            		int rem = num % 10;
            		num /= 10;
            		switch(rem) 
			{
                		case 0: System.out.print("Zero "); break;
                		case 1: System.out.print("One "); break;
                		case 2: System.out.print("Two "); break;
               			case 3: System.out.print("Three "); break;
                		case 4: System.out.print("Four "); break;
                		case 5: System.out.print("Five "); break;
                		case 6: System.out.print("Six "); break;
                		case 7: System.out.print("Seven "); break;
                		case 8: System.out.print("Eight "); break;
                		case 9: System.out.print("Nine "); break;
            		}
            			
        	}
	}
}
