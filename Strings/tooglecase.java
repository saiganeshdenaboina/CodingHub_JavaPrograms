class Main
{
	public static void main(String[] args)
	{
		String s="madam arora teaches malayalam";
		String[] a=s.split(" ");
		System.out.println("Plaindrome words ");
		for(int i=0;i<a.length;i++)
		{
			String s1=a[i];
			StringBuffer sb=new StringBuffer(s1);
			if(s1.equals(sb.reverse().toString()))
			{
				System.out.println(sb);
			}
		}
		
		System.out.println("Non palindrome words");
		for(int i=0;i<a.length;i++)
		{
			String s1=a[i];
			StringBuffer sb=new StringBuffer(s1);
			if(!s1.equals(sb.reverse().toString()))
			{
			
				char[] c=s1.toCharArray();
				for(int x=0;x<c.length;x++)
				{
					if(x%2==0)
					{
						c[x]-=32;
					}				
				}
				System.out.println(c);
			}
		}
	}
}