class Main 
{
	public static void main(String[] args) 
	{
		/*
        	String str = "programming";
        	System.out.println("Length: " + str.length());
        	System.out.println("First: " + str.charAt(0));
        	System.out.println("Last: " + str.charAt(str.length() - 1));
        	System.out.println("Substring (3 to 8): " + str.substring(3, 8));

		*/

		String str="hello world";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.println(ch+" ");
			}
		}
		System.out.println("Count of vowels are : "+count);
    	}
}
