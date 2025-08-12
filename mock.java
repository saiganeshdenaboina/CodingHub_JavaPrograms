class Main
{
	public static void main(String[] args)
	{
		/*
		char ch='a';
		switch(ch)
		{
			case 'a','e','i','o','u' ->
				System.out.println("vowel");
			default ->
				System.out.println("cnsonent");
		}
		*/
		/*
		int n1=10,n2=20,n3=30;
		if(n1<n2&&n1<n3)
			System.out.println(n1);
		else if(n2<n3)
			System.out.println(n2);
		else
			System.out.println(n3);
		*/
		/*
		int num=134629,count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2!=0)
				count++;
			num/=10;
		}		
		System.out.println(count);
		*/
		/*
		int n=7;
		for(int i=41;i>=23;i--)
		{
			System.out.println("7 * "+i+"="+(n*i));
		}
		*/
		/*
		char ch='a';
		int c=(int)ch-32;
		System.out.println((int)ch);
		*/
		int year=2024;
		if((year%4==0 && year%100 !=0) || (year%400==0))
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
		
	}
}