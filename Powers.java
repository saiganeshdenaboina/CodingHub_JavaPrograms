class Main
{
	public static void main(String[] args)
	{
		Power p=new Power();
		p.num=132;
		p.Cal();
		
	}
}
class Power
{
	int num;
	void Cal()
	{
		int sum=0,product=1;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num/=10;		
		}
		compare(sum,product);
	}
	void compare(int sum,int product)
	{
		System.out.println(sum==product?"Power":"not power");
	}
}
	