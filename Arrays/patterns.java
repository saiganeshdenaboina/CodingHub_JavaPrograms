class Main
{
	public static void main(String[] args)
	{
		/*
		int row=5,col=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
		*/
		/*output is
		1 1 1 1 1
		2 2 2 2 2
		3 3 3 3 3
		4 4 4 4 4
		5 5 5 5 5
			*/
		/*
		int row=5,col=5;
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		*/
		/*output is
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
			*/	
		/*
		int row=5,col=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r%2!=0||c==1||c==5)
					System.out.print("# ");
				else
					System.out.print(c+" ");
			}
			System.out.println();
		}
			*/
		/*output is
		# # # # #
		# 2 3 4 #
		# # # # #
		# 2 3 4 #
		# # # # #
			*/
		/*
		int row=5,col=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r==c||r+c==row+1)
					System.out.print(r+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		*/
		/*output is
		1       1
		  2   2
		    3
		  4   4
		5       5
		 */
		/*
		int row=5,col=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r==c||r+c==row+1)
					System.out.print(c+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		*/
		/*output is
		1       5
		  2   4
		    3
		  2   4
		1       5
			*/
		/*
		int row=5,col=5;
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if((r+c)%2==0)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		*/
		/*
		*   *   *
 		  *   *  
		*   *   *
		  *   *  
		*   *   *
			*/
		/*
		int row=5,col=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r==1 || r==row || c==1 ||c==col)
					System.out.print("1 ");
				else if(r==2||r==row-1||c==2||c==col-1)
					System.out.print("2 ");
				else
					System.out.print("3 ");
			}
			System.out.println();
		}
		*/
		/*output is
		 1 1 1 1 1
		 1 2 2 2 1
		 1 2 3 2 1
		 1 2 2 2 1
		 1 1 1 1 1
		*/	





















	 
	}
}