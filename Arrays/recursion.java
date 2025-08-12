class Main
{
	public static void main(String[] args)
	{
		Main m=new Main();
		m.factorial(5,1);
	}
	void factorial(int n,int fact)
	{
		if(n==0)
			System.out.println("factorial is :"+fact);
		else
		{
			fact*=n;
			n--;
			factorial(n,fact);
		}
	}
	
}