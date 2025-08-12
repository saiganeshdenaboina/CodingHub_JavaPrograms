class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello all good evening");
		char[] a=s.toCharArray();
		/*
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x] > a[y])
				{
					char temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(char i:a)
			System.out.print(i+" ");
		*/

		for(int x=0;x<a.length;x++)
		{
			int min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
					min=y;
			}
			char temp=a[x];
			a[x]=a[min];
			a[min]=temp;
		}
		for(char i:a)
			System.out.print(i+" ");
	}
}