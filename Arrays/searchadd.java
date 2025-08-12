class search
{
	void check(int[] a,int pos,int n,int found)
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==found)
			{
				System.out.println("element found");
				for(int x=i;x<a.length-1;x++)
				{
					a[x]=a[x+1];
				}
				a[a.length-1]=0;
				break;
			}
		}
		if(i>=a.length)
		{
			System.out.println("Element not found");
			for(i=a.length-1;i>pos;i--)
			{
				a[i]=a[i-1];
			}
			a[pos]=n;
		}
		for(int temp:a)
			System.out.print(temp+" ");

	}
}
class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,0};
		int pos=2,n=25;
		int found=30;

		search s=new search();
		s.check(a,pos,n,found);
	}
}