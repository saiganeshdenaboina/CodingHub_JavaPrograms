
public class Test
{
	public static void main(String[] args)
	{
		//print all digits individually
		/*

		int num=67236;
		while(num!=0)
		{
			int rem=num%10;
			System.out.println(rem);
			num/=10;
						
		}

		*/

		//print sum of even digits and multiplication of odd?
		/*

		int num=7283546,eSum=0,oMul=1;
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
				eSum+=rem;
			else
				oMul*=rem;			
			num/=10;
		}
		System.out.println("Sum of Even Digits: "+eSum+"\n"+"Multiplication of odd Digits: "+oMul);

		*/

		//Check the number is palindrome or not
		/*

		int num=732,count=0,temp=num,rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");

		*/

		//number to words
		/*

        	int num = 12459,rev = 0,temp = num;

        	while(num != 0) 
		{
            		int rem = num % 10;
            		rev = rev*10+rem;
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
            			rev /= 10;t54t54
        	}

		*/

		//print the difference between number of digits
		/*
		int num1=13244,num2=16273442,count1=0,count2=0;
		while(num1!=0)
		{
			count1++;
			num1/=10;	
		}System.out.println("num1 Count is : "+count1);
		while(num2!=0)
		{
			count2++;
			num2/=10;
		}
		System.out.println("num2 count is : "+count2);
		if(count1>count2)
			System.out.println("Difference between two number is "+(count1 - count2));
		else
			System.out.println("Difference between two number is "+(count2 - count1));
		
		*/
		/*
		int num=153,sum=0,temp=num,count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		while(num>0)
		{
			int rem=num%10;
			sum+=Math.pow(rem,count);
			num/=10;
			
		}
		if(sum==temp)
			System.out.println("armstrong");
		else
			System.out.println(" not a armstrong");
		*/

            	int num=161900,zerocount=0,rev1=0,rev2=0,temp=num,count=0;
            	while(num%10==0)
                {
                	zerocount++;
                    	num/=10;
                }System.out.println(zerocount);
            	num=temp;
            	while(num>0)
            	{
               		int rem=num%10;
                	rev1=rev1*10+rem;
                	num/=10;
           	 }
            	while(rev1>0)
            	{
                	int rem=rev1%10;
                	rev2=rev2*10+rem;
                	rev1/=10;
            	}
            	int result=rev2;
            	while(count<zerocount)
            	{
                	result*=10;
                	count++;
            	}
            	System.out.println(result);

	
	}
}
