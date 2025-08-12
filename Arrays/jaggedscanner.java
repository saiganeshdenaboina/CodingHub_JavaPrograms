import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter number of rows: ");
        	int rows = sc.nextInt();

        	int[][] a = new int[rows][];
		for (int i = 0; i < rows; i++) 
		{
            		System.out.print("Enter number of elements for row " + (i) + ": ");
            		int cols = sc.nextInt();
            		a[i] = new int[cols]; 
            		System.out.println("Enter "+cols+" elements in "+ i + " row :");
            		for (int j = 0; j < cols; j++) 
	    		{
                		a[i][j] = sc.nextInt();
            		}
        	}
        	System.out.println("Jagged Array:");
        	for (int i = 0; i < a.length; i++) 
		{
            		for (int j = 0; j < a[i].length; j++) 
	    		{
                		System.out.print(a[i][j] + " ");
            		}
            		System.out.println();
        	}
    	}
}
