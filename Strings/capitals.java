class Main
{
	public static void main(String[] args)
	{
		String s=new String("heLl5 world");
		char[] a=s.toCharArray();

		for(int x=0;x<a.length;x++);
		{
			if((a[x]>='A'&& a[x]<='Z') || (a[x]>='a' && a[x]<='z') && x%2==0)
			{
				if(a[x]>='A'&&a[x]<='Z')
					System.out.print(a[x]+" ");
				else
				{
					a[x]-=32;
					System.out.print(a[x]+" ");
				}
			}
			else
				System.out.print(a[x]+" ");
		}
	}
}