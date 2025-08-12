class Main
{
	public static void main(String[] args)
	{
		String s="12345";
		int n=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				n=n*10+(ch-'0');
			}
		}
		System.out.print(n);
	}
}