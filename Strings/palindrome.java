class Main
{
	public static void main(String[] args)
	{
		String s1="a man1 a plan & 2 a canal , panama";
		char[] a=s1.toCharArray();
		String s2="";
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>='a' && a[x]<='z')
			s2+=a[x];
		}
		StringBuffer sb=new StringBuffer(s2);
		if(s2.equals(sb.reverse().toString()))
			System.out.println("palindrome");
		else
			System.out.print("not palindrome");
	}
}