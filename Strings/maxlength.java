class Main
{
	public static void main(String[] args)
	{
		String s="hello all good morning";
		String[] a=s.split(" ");
		int max=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i].length()>a[max].length())
				max=i;
		}
		System.out.print(a[max]);
	}
}