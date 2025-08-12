
public class Count
{
	public static void main(String[] args)
	{
		int num=34869836,count=0,sum=0;
		while(num!=0)
		{
			count++;
			int rem=num%10;
			num/=10;
			if(count%2!=0)
			{
				count=count+rem;
				System.out.println(sum);	
			}		
}
	}
}
