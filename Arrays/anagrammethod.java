class Main 
{
    	static boolean check(int[][] a) 
	{
     
        	int[] ref = a[0];

        	for (int i = 1; i < a.length; i++) 
		{
            		int[] current = a[i];

            		boolean[] b = new boolean[current.length];
            		for (int j = 0; j < ref.length; j++) 
			{
                		boolean found = false;
               			for (int k = 0; k < current.length; k++) 
				{
                    			if (!b[k] && ref[j] == current[k]) 
					{
                        			b[k] = true;
                        			found = true;
                        			break;
                    			}
                		}
                		if (!found) 
				{
                   			 return false; 
                		}
            		}
        	}
        	return true;
    	}

    	public static void main(String[] args) 
	{
        	int[][] a = {
            		{4, 2, 8, 1},
            		{1, 2, 4, 8},
           		{8, 4, 1, 2},
            		{4, 1, 2, 0}
        				};

        	if (check(a)) 
		{
            		System.out.println("Matrix is an Anagram");
            		for (int i = 0; i < a.length; i++) 
			{
                		for (int j = 0; j < a[i].length; j++) 
				{
                    			System.out.print(a[i][j] + " ");
                		}
                		System.out.println();
            		}
        	} 
		else 
		{
           		 System.out.println("Matrix is NOT an Anagram");
        	}
    	}
}
