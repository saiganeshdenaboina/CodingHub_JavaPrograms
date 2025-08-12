public class Inav 
{
    public static void main(String[] args) 
	{
       	 	int num = 179;
		int sum=num;
        	while (sum>9) 
        	{
            		int temp=sum;
            		sum=0;
            		while(temp > 0)             
			{
                		sum+=temp%10;
               			 temp/=10;
           		 }
			
       		 }

        	if (sum==1) 
		{
            		System.out.println("Inav Number");
        	} 
		else 	
		{
            		System.out.println("Not Inav Number");
       		 }
    	}
}
