class Main
{
	public static void main(String[] args)
	{
		String s="A1h3m8m6vhf46";
		char[] c=s.toCharArray();
		int n=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0'&&c[i]<='9')
			{
			n+=c[i];
			System.out.println(c[i]);
			}
		}
		System.out.println(n);
	}
}