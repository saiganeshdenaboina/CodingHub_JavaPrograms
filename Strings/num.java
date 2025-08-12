class Main
{
	public static void main(String[] args)
	{
		String s="a5b4c6";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)		
		{
			if(a[i]>='a' && a[i]<='z')
				{
					char ch=a[i];
					i++;
					int num=a[i]-'0';
					for(int j=0;j<num;j++)
						System.out.print(ch);
				}
		}
	}
}
