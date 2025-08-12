class Main
{
	public static void main(String[] args)
	{
		String s="hello all";
		char[] a=s.toCharArray();
		
		boolean[] b=new boolean[26];
		for(int i=0;i<a.length;i++)
		{
			//if(b[i])
				//continue;
			for(char ch='a';ch<='z';ch++)
			{
				if(a[i]==ch)
				{
					b[a[i]-'a']=true;
					break;
				}
			}
		}
		for(int i=0;i<26;i++)
		{
			if(!b[i])
				System.out.print((char)(i+'a')+" ");
		}
	}
}