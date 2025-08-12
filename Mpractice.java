class Student
{
	int calPrime()
	{
		int n=12,factor=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				factor++;
		}
		return factor;
	}
	String Palindrome()
	{
		int num=127,rev=0,temp=num;
		while(num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		if(rev==temp)
			return "Palindrome";
		else
			return "Not Palindrome";
	}
}
class Mpractice
{
	public static void main(String[] args)
	{
		Student s=new Student();
		int result=s.calPrime();
		System.out.println(result==2?"Prime":"Not Prime");
		String pal=s.Palindrome();
		System.out.println(pal);
	}
}