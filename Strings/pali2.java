class Main
{
	public static void main(String[] args)
	{
		String s1="a man1 a plan & 2 a canal , panama";
		String s2="";
		int l=0,r=s1.length();
		for(int x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)>='a'&&s1.charAt(x)<='z')
				s2+=s1.charAt(x);
		}
		StringBuffer sb=new StringBuffer(s2);
		sb.reverse();
		if(s2.equals(sb.toString()))
			System.out.println("palindrome");
		else
			System.out.print("not palindrome");
	}
}