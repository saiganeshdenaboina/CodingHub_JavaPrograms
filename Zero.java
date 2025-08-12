public class Zero
{
	public static void main(String[] args)
	{
		int num=17329000,count1=0,count2=0,
rev1=0,rev2=0,sum=0;
		while(num>0)
		{
			count1++;
			int rem=num%10;
			rev1=rev1*10+rem;
			num/=10;
		}
		while(rev1>0)
		{
			count2++;
			int rem=rev1%10;
			rev2=rev2*10+rem;
			rev1/=10;
		}
		int diff=count1-count2;
		sum=rev2*(int)Math.pow(10,diff);
		System.out.println(sum);
		 		
	}
}