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
		/*	
		int x=1;
		for(int r=1;r<=3;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print(x+" ");
				x++;
			}
			x=r+1;
			System.out.println();
		}
		*/
		/*output is
		1 2 3 4 
		2 3 4 5
		3 4 5 6
			*/
		/*
		for(int r=1;r<=3;r++)
		{
			for(int c=5;c>=1;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		*/
		/*output is
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		*/
		/*
		int row=5,col=5,x=1;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r==c)
					System.out.print(x+" ");
				else if(r+c==row+1)
					System.out.print(row+" ");
				else
					System.out.print("  ");
			}
			x+=2;
			System.out.println();
		}
		*/
		/*output is
		1      5
		  3   5
		    5
    		  5   7
		5      9
		*/
		/*
		for(int r=1;r<=4;r++)
		{
			int x=r;
			for(int c=1;c<=5;c++)
			{
				if(r%2!=0)
				{
					System.out.print(x+" ");
					x+=2;
				}
				else
				{
					System.out.print(x+" ");
					x++;
				}
			}
			System.out.println();
		}
		*/
		/*output is
		1 3 5 7 9
		2 3 4 5 6
		3 5 7 9 11
		4 5 6 7 8
		*/
		/*
		int row=4,col=4,x=1,y=0;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r%2!=0)
				{
					System.out.print(x+" ");
					y=x;
					x+=2;
				}
				else
				{
					System.out.print(y+" ");
					x=y;
					y--;
				}
			}
			System.out.println();
		}
		*/
		/*output is
		1 3 5 7
		7 6 5 4
		4 6 8 10
		10 9 8 7
		*/
		/*
		int row=3,col=4;
		char ch='A';
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		*/
		/*output is
		A B C D
		E F G H
		I J K L
		*/
		/*
		int row=4,col=4;
		char ch='A',x='a';
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r%2!=0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(x+" ");
					x++;
				}
			}
			System.out.println();
		}
		*/
		/*output is
		A B C D
		a b c d
		E F G H
		i j k l
		*/
		/*
		int row=4,col=4;
		char ch='A',x='z';
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r%2!=0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(x+" ");
					x--;
				}
			}
			System.out.println();
		}
		*/
		/*output is
		A B C D
		z y x w
		E F G H
		v u t s
		*/
		/*
		int row=4,col=4;
		char ch='A';
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r%2!=0)
				{
					
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print((char)(ch+32)+" ");
					ch++;
				}
			}
			System.out.println();
		}
		*/
		/*output is
		A B C D
		e f g h
		I J K L
		m n o p 
		*/
		/*
		int row=5,col=4;
		char ch='A',x='a';
		for(int r=1;r<=row;r++)
		{
			
			for(int c=1;c<=col;c++)
			{
				if(r%2!=0)
				{
					
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(x+" ");
					x++;
				}
			}
			System.out.println();
			if(r%2!=0)
				ch+=4;
			else
				x+=4;
		}
		*/
		/*output is
		A B C D
		a b c d
		I J K L
		i j k l
		Q R S T
		*/
		int row=4,col=5,i=2;
		char ch='A';
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r%2!=0)
				{
					System.out.print(i+" ");
					i++;
				}
				else
				{
					System.out.print(ch+" ");
					ch++;
				}
			}
			if(r%2==0)
				ch+=32;
			System.out.println();
		}
















	 
	}
}