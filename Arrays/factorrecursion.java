class Main
{
	public static void main(String[] args)
	{
		Main m=new Main();
		m.factors(1,12,0);
	}
	int factors(int start,int end,int count)
	{
		if(start>end)
		{
			System.out.println("Total factors of "+end+" is "+count);
		}
		else
		{
			if(end%start==0)
				count++;
			start++;
			factors(start,end,count);
		}
	}
}