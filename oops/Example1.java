class Example 
{
    	public static void main(String[] args) 
	{
        	try 
		{
            		System.out.println("Step 1: Try block starts");

            		// Risky code (division by zero)
            		int result = 10 / 0;

            		System.out.println("Step 2: This line will NOT execute");
        	} 
		catch (Exception e) 
		{
            		// Catching the exception
            		System.out.println("Exception caught: " + e);
           		System.out.println("Message: " + e.getMessage());
        	} 
		finally 
		{
            		// Always executed
            		System.out.println("Step 3: Finally block executed");
        	}

       		 System.out.println("Step 4: Program continues after try-catch-finally");
  	  }
}
