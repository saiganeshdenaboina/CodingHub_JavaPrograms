public class Armrange
{
	public static void main(String[] args)
	{
		int num=164;
		for(int i=1;i<=10;i++)
		{
			int sum=0,temp=num,count=0;
			while(num>0)
			{
				count++;
				num/=10;
			}
			num=temp;
			while(num>0)
			{
				sum+=Math.pow(num%10,count);
				num/=10;
			}
			if(sum==temp)
			{
				System.out.println("Armstrong number"+i);
				break;
			}
			else
			{
				num=sum;
			}
			
		}	
	}
}
