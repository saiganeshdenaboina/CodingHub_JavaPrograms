
class Main 
{
    public static void main(String[] args) 
{
	/*
        for(int i=4;i>0;i--)
        {
            int j=9,n=5;
            for(int k=1;k<=i;k++)
            {
                System.out.print(j+" ");
                j=j+n;
                n++;
            }
            System.out.println();
		*/
		/*output 
		9 14 20 27 
		9 14 20 
		9 14 
		9 
		*/
		/*
	for(int i=4;i>0;i--)
    	{
        	int j=27,n=9;
        	for(int k=0;k<i;k++)
        	{
            		System.out.print(j+" ");
            		j-=n;
            		n--;
        	}
        	System.out.println();
		*/

		/*output is
		27 18 10 3 
		27 18 10 
		27 18 
		27 
		*/
	/*
	 int rows = 4;

        for (int i = 0; i < rows; i++) {
            for (int x = 0; x < i * 4; x++) {
                System.out.print(" ");
            }

            int j = 8, n = 5;

            for (int k = 0; k < rows - i; k++) {
                System.out.print(j + " ");
                j += n;
                n--;
            }

            System.out.println(); 
        }
		*/
		/*output is
		8 13 17 20
		   8 12 15
		      8 12
			 8
		*/
        }
    }
}