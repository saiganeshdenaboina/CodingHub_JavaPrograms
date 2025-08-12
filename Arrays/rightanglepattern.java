class Main
{
	public static void main(String args[])
	{
		/*
		int row=6;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==row||c==r)
					System.out.print("#");
				else
					System.out.print("$");
			}
			System.out.println();
		}
		*/
		/*output is
		#
		# #
		# $ #
		# $ $ #
		# $ $ $ #
		# # # # #
		*/
		/*
		int row=6;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==row||c==r)
					System.out.print("#");
				else
					System.out.print("$");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			//for(int c=r;c<=row;c++)
			//for(int c=row;c>=1;c--)
			//		
			{
				System.out.print("#  ");
			}
			System.out.println();
		}
		*/
		/*output is
		# # # # # 
		# # # #
		# # #
		# # 
		#
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				if(r==c||c==row||r==1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
		*/
		/*output is
		# # # # #
		#     #
		#   #
		# #
		#
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<row;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	       */
		/*output is
		#
		# #
		# # #
		# # # #
		# # # # #
		# # # #
 		# # #
		# #
		#
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		for(int r=1;r<=row;r++)
		{
			for(int c=2;c<=r;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==c)
				  	System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int r=2;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				if(r==c||c==row)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print("# ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("# ");
			}
			for(int c=r;c<=row;c++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		*/
		/*output is
		# $ $ $ $ $ 
		# # $ $ $ $
		# # # $ $ $
		# # # # $ $
		# # # # # $
		*/
		/*
		int row=6;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=row;c++)
			{
				if(c==1||r==c||r==row)
					System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=row;c++)
			{
				if(r==1||r==c||c==row)
					System.out.print("$ ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=row;c++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		*/
		/*output is
		# # # # #
		 # # # #
		  # # #
		   # #
		    #
			*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<2*r;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		*/
		/*output is
			 #
			# #
		       # # #
		      # # # #
		    # # # # # #
			*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<2*r;c++)
			{
				if(r==row||c==1||c==2*r-1)
					System.out.print("# ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		*/
		/*
		int row=9;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=row;c++)
			{
				if(r==1||r==c||c==row)
					System.out.print("# ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=row-r;c++)
				System.out.print("  ");
			for(int c=1;c<=2*r-1;c++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		for(int r=row-1;r>=1;r--)
		{
			for(int c=1;c<=row-r;c++)
				System.out.print("  ");
			for(int c=1;c<=2*r-1;c++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		*/
		/*
		   #
     		 # # #
  	      # # # # #
            # # # # # # #
	  # # # # # # # # #
  	    # # # # # # #
    	      # # # # #
                # # #
                  #
			*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=row-r;c++)
				System.out.print("  ");
			for(int c=1;c<=2*r-1;c++)
			{
				if(c==1||c==2*r-1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int r=row-1;r>=1;r--)
		{
			for(int c=1;c<=row-r;c++)
				System.out.print("  ");
			for(int c=1;c<=2*r-1;c++)
			{
				if(c==1||c==2*r-1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		*/
		/*
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(" #  ");
			}
			System.out.println();
		}
		for(int r=row-1;r>=1;r--)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(" #  ");
			}
			System.out.println();
		}
		*/
		
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				if(c==1||c==r)
					System.out.print(" #  ");
				else
					System.out.print("    ");
			}
			System.out.println();
		}
		for(int r=row-1;r>=1;r--)
		{
			for(int c=r;c<=row;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				if(c==1||c==r)
					System.out.print(" #  ");
				else
					System.out.print("    ");
			}
			System.out.println();
		}	
		









































	}
}