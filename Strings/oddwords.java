class Main

{
	public static void main(String[] args)
	{
		String s=new String("hello all good morning");
		String[] a=s.split(" ");
		int min=0,max=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[min].length()>a[x].length())
				min=x;
			if(a[max].length()<a[x].length())
				max=x;
		}	
		System.out.println("Minimum length String is : "+a[min]);
		System.out.println("Maximum length string is : "+a[max]);
	}
}