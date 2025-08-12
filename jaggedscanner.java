import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter number of rows: ");
        	int rows = sc.nextInt();

        	int[][] jagged = new int[rows][];
		for (int i = 0; i < rows; i++) 
		{
            		System.out.print("Enter number of elements for row " + (i) + ": ");
            		int cols = sc.nextInt();
            		jagged[i] = new int[cols]; 
            		System.out.println("Enter " + cols + " elements for row " + (i) + ":");
            		for (int j = 0; j < cols; j++) 
	    		{
                		jagged[i][j] = sc.nextInt();
            		}
        	}
        	System.out.println("\nJagged Array:");
        	for (int i = 0; i < jagged.length; i++) 
		{
            		for (int j = 0; j < jagged[i].length; j++) 
	    		{
                		System.out.print(jagged[i][j] + " ");
            		}
            		System.out.println();
        	}
    	}
}
