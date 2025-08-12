class Main
{
	public static void main(String[] args)
	{
		String s="hii hello all good night";
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			StringBuffer sb=new StringBuffer(a[i]);
			System.out.print(sb.reverse()+" ");
		}
	}
}