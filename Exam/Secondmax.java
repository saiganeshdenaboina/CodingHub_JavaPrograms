public class Secondmax
{
	public static void main(String[] args)
	{	
		int num=27189,secondmax=0,max=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem>max)
			{
				secondmax=max;
				max=rem;
			}
			else if(rem != max &&rem>secondmax)
			{
				secondmax=rem;
			}
			num/=10;
		}
		System.out.println("Maximum is :"+max+"\n"+"second maximum is : "+secondmax);
	}
		
}