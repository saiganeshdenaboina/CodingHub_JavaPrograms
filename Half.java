public class Half
{
	public static void main(String[] args)
	{
		int num=123456,rev=0;
		int n1=num%1000;
		int n2=num/1000;
	        int result=n1+n2,temp=result;
		while(result!=0)
		{
			rev=rev*10+(result%10);
			result/=10;
		}
		if(temp==rev)
			System.out.println("palimdrome");
		else
			System.out.println(rev+" not a palindrome");		
	}
}