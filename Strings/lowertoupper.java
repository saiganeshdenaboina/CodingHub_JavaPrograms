class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello All");
		char[] a=s.toCharArray();
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>='A'&&a[x]<='Z')
			{
				a[x]+=32;
			}
			else
			{
				 a[x]-=32;
			}
		}
		for(char i:a)
			System.out.print(i+" ");

		System.out.println();

		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}