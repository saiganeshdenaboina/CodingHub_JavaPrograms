class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40};
		int[] b=new int[]{50,60,70};
		
		reverse r=new reverse();
		for(int t:r.rev(a,b))
			System.out.print(t+" ");
	}
}
class reverse
{
	int[] rev(int[] a,int[] b)
	{
		int[] c=new int[a.length+b.length];

		for(int i=0,x=0;i<a.length;i++,x++)
			c[i]=a[i];
		for(int i=a.length,x=b.length-1;i<c.length;i++,x--)
			c[i]=b[x];
		return c;
	}
}