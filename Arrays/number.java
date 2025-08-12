class Main
{
	public static void main(String[] args)
	{
		for(int r=1;r<=5;r++)
		{
			int n=3;
			for(int c=0;c<=5-r;c++)
			{
				System.out.print(n+" ");
				if(c==0)
					n+=6;
				else
					n+=3;
			
			}
			System.out.println();
		}
	}
}
