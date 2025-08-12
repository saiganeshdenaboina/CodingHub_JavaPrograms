public class Check
{
	public static void main(String[] args)
	{
		
		int num=153,temp=num,rev1=0,rev2=0,add1=0,add2=0;
		while(num>0)
		{
			rev1=rev1*10+(num%10);
			num/=10;
		}
		if(temp==rev1)
		{
			System.out.println("palindrome");
		}
		else
		{
			add1=rev1+temp;
			num=add1;
		}
		System.out.println(num);
		
		
		
	}
}