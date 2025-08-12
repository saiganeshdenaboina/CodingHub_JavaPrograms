public class Evil
{
	public static void main(String[] args)
	{
		int n=10,sum=0,result=0;
		for(int i=1;i<=n;i++)
		{
			sum=(int)Math.sqrt(n);
			while(sum>0)
			{
				int rem=sum%10;
				result+=rem;
				sum/=10;
			}
			if(result==n)
				System.out.println("Evil Number");		
		}
		
	}
}
	