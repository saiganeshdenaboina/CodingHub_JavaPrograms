class Main
{
	public static void main(String[] args)
	{
		String s="bshtjk hdjs hello all jdlmn";
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String s1=a[i];
			char[] c=s1.toCharArray();
			int count=0;
			for(int x=0;x<c.length;x++)
			{
				switch(c[x])
				{
					case 'a','e','i','o','u':
						count++;
				}
			}
			if(count==0)
				System.out.print(s1+" ");
		}
	}
}