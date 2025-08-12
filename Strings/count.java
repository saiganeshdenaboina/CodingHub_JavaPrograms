/*
class Main
{
	public static void main(String[] args)
	{
		String s="aaaaabbbbbbbcccccc";
		char[] a=s.toCharArray();
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			char ch=a[i];
			int count=1;
			while(i+1<a.length&&a[i]==a[i+1])
			{
				count++;
				i++;
			}
			s1+=ch+String.valueOf(count);
		}
		System.out.print(s1);
	}
}
*/
class Main
{
	public static void main(String[] args)
	{
		String s="aaaaaabbbbcccc";
		String num="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int first=s.indexOf(ch);
			int last=s.lastIndexOf(ch);

			int count=last-first+1;
			num+=ch+String.valueOf(count);
			i=last+1;
		}
		System.out.println(num);
	}
}