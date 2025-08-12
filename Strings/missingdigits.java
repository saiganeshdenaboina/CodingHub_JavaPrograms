/*
class Main
{
	public static void main(String[] args)
	{
		int n=125;
		boolean[] b=new boolean[10];
		while(n!=0)
		{
			int rem=n%10;
			b[rem]=true;
			n/=10;
		}
		for(int i=0;i<=9;i++)
		{
			if(!b[i])
				System.out.print(i+" ");
		}
	}
}
*/


class Main 
{
	public static void main(String[] args) 
	{
      		 int temp=165;
    		for(int i=0;i<=9;i++)
  		{
			int n=temp;
			boolean found=false;
       			 while(n!=0)
        		{
            			int rem=n%10;
            			if(rem==i)
				{
					found=true;
                			break;
				}
           			n/=10;
        		}
			if(!found)
        			System.out.print(i+" ");
    		}
   	 }
}