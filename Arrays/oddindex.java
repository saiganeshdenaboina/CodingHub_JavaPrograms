class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};
		
		for(int i=0,j=i+1;i<a.length-1;i++,j++)
			if(i%2==0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		for(int i=0,j=i+1;i<a.length-1;i++,j++)
			if(i%2!=0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}