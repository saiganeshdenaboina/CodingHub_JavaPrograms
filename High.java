public class High
{
	public static void main(String[] args)
	{
		int num=3992458,max=0,secondmax=0,small=9,secondsmall=9;
		for(int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			if(rem>max)
			{
				secondmax=max;
				max=rem;
			}
			else if(rem!=max && rem>secondmax)
				secondmax=rem;	

			if(rem<small)
			{
				secondsmall=small;
				small=rem;
			}else if(rem>small && rem<secondsmall)
				secondsmall=rem;
		}
		System.out.println(max);
		System.out.println(secondmax);
		System.out.println(small);
		System.out.println(secondsmall);
	}
}