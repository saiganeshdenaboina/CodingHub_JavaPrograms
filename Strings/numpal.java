class Main
{
	public static void main(String[] args)
	{
		String s="a1bb2ch1";
		char[] a=s.toCharArray();
		String num="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='0'&&a[i]<='9')
			{
				num+=a[i];
			}
		}
		//System.out.println(num);
		StringBuffer sb=new StringBuffer(num);
		String rev=sb.reverse().toString();
		if(num.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}