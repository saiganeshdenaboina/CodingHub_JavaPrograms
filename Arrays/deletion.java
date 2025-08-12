class firstinsert
{
	int[] element(int[] a,int pos)
	{
		a[pos]=0;
		for(int i=pos;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=0;
		return a;
	}
}
class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60};
		int pos=1;
	
		firstinsert f=new firstinsert();
		int[] res=f.element(a,pos);
		for(int i:res)
			System.out.print(i+" ");
	}
}