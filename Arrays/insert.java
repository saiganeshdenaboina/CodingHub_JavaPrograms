class insert
{
	int[] check(int[] a,int pos,int n)
	{
		
		for(int i=a.length-1;i>pos;i--)
		{
			a[i]=a[i-1];
		}
		a[pos]=n;
		return a;
	}
}
class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80,90,0};
		int pos=4,n=45;

		insert x=new insert();
		for(int temp:x.check(a,pos,n))
			System.out.print(temp+" ");
	}
}