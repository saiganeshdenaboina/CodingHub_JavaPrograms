class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};
		left l=new left();
		for(int temp:l.lrotate(a))
			System.out.print(temp+" ");
	}
}
class left
{
	int r=3;
	int[] lrotate(int[] a)
	{
		int[] res=new int[a.length];
		int index=0;
		for(int i=r;i<a.length;i++)
			res[index++]=a[i];
		for(int x=0;x<r;x++)
			res[index++]=a[x];
		return res;
	}
}