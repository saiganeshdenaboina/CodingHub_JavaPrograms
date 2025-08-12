public class Armnest
{
	public static void main(String[] args)
	{
		int count1=0;
		for(int x=1;x<=10000000;x++)
		{
			int num=x,temp=num,count=0,sum=0;
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
			if(temp==sum)
			{
				count1++;
				System.out.println(x+" is a armstrong number");
			}
		}
		System.out.println("Count of Total Armstrong Numbers from 1 to 1cr is : "+count1);
	}
}
	