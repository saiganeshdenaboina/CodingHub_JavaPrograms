class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40};
		int[] b=new int[]{50,60,70};
		int[] c=new int[a.length+b.length];

		for(int i=a.length-1,x=0;i>=0;i--,x++)
			c[x]=a[i];
		for(int i=a.length,x=0;i<c.length;i++,x++)
			c[i]=b[x];
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
	}
}