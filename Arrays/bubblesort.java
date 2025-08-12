class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,50,40,70,60,26};
		for(int i=0;i<a.length;i++)
		{
			for(int x=0;x<a.length-1-i;x++)
			{
				if(a[x]>a[x+1])
				{
					int temp=a[x];
					a[x]=a[x+1];
					a[x+1]=temp;
				}
			}
		}
		for(int temp:a)
			System.out.print(temp+" ");
	}
}