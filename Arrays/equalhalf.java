class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,74,29,48,18,35,8,19};
		int mid=(a.length-1)/2;
	
		for(int i=0,j=i+1;j<=mid;i++,j++)
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		for(int i=mid+1,j=i+1;j<a.length;i++,j++)
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}