class Main
{
	public static void main(String[] args)
	{
		String s="hello all good morning";
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)		
		{
			String s1=a[i];
			char[] c=s1.toCharArray();
			if(i%2==0)
			{
				for(int x=c.length-1;x>=0;x--)
				{
					System.out.print(c[x]);
				}
				System.out.print(" ");
				
			}
			else
			{
				for(int x=0;x<c.length;x++)
				{
					System.out.print((char)(c[x]-32));
				}
				System.out.print(" ");
			}
		}
	}
}