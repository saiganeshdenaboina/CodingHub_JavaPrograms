class Main
{
	public static void main(String[] args)	
	{
		String s="aaaabbcc";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.indexOf(ch)==i)
			{
				int first=s.indexOf(ch);
				int last=s.lastIndexOf(ch);
				int count=last-first+1;
				result+=ch+""+count;
			}
		}
		System.out.println(result);
	}
}