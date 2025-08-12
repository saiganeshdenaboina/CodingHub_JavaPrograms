public class NumbertoWords
{
	 public static void main(String[] args) 
	{
		/*
        	int num = 124,rev = 0,temp = num;

        	while(num != 0) 
		{
            		int rem = num % 10;
            		rev = rev * 10 + rem;
            		num /= 10;
        	}
        	while(rev != 0) 
		{
            		int i = rev % 10;
            		switch(i) 
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
            			rev /= 10;
        	}
		*/
	
		int num = 78943, count=0,eSum = 0, oSum= 0;
		while(num != 0)
		{	
			count++;
			int rem = num % 10;
			if(count%2==1)
			{
				System.out.println(rem+" --> " +count);
				eSum+=rem;
			}else
			{
				System.out.println(rem+" --> " +count);
				oSum+=rem;
	
			}
			num/=10;
						
		}
		System.out.println("Sum of even Iterations: " + eSum);
		System.out.println("Sum of odd Iterations: " + oSum);
		System.out.println("Total sum: " + (eSum + oSum));
	

    	}
}
