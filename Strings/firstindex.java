class Main
{
	public static void main(String[] args)
	{
		String s="vital info resource under seize";
		String[] a=s.split(" ");
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			s1+=a[i].charAt(0);
		}
		System.out.print(s1);
	}
}