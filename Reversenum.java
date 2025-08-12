class Reversenum
{	public static void main(String[] args)
	{
		int num=141,rev=0,temp=num;
		while(num!=0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
		}
		num=temp;
		if(num==rev)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		System.out.println("Before Reverse:"+num+"\n"+"After Reverse:"+rev);

	}
}