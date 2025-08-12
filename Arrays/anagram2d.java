class Main 
{
	public static void main(String[] args) 
	{
        	int[][] a = new int[][]{{4, 2, 8, 1},
            				{1, 2, 4, 8},
            				{8, 4, 1, 0}};
        for (int i = 0; i < a.length; i++) 
	{
            	for (int j = 0; j < a[i].length - 1; j++) 
		{
                	for (int k = 0; k < a[i].length - 1 - j; k++) 
			{
                    		if (a[i][k] > a[i][k + 1]) 
				{
                        		int temp = a[i][k];
                        		a[i][k] = a[i][k + 1];
                        		a[i][k + 1] = temp;
                   		}
                	}
            	}
        }

        boolean isAnagram = true;
        for (int i = 1; i < a.length; i++) 
	{
            	for (int j = 0; j < a[i].length; j++) 
		{
                	if (a[i][j] != a[0][j]) 
			{
                    		isAnagram = false;
                    		break;
                	}
            	}
            if (!isAnagram) break;
        }

        if (isAnagram)
            System.out.println("The rows are anagrams.");
        else
            System.out.println("The rows are NOT anagrams.");
    }
}
