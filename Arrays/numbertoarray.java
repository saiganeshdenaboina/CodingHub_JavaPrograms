class Main
{
	public static void main(String[] args)
	{
		int num=26348,count=0,temp1=num,rev=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp1;
		while(num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		int[] a=new int[count];
		int index=0;
		while(rev>0)
		{
			a[index]=rev%10;
			rev/=10;
			index++;
		}
		for(int i=0;i<a.length;i++)
		{
			int max=i;
			for(int x=i+1;x<a.length;x++)
			{
				if(a[max]<a[x])
					max=x;
			}
			int temp=a[i];
			a[i]=a[max];
			a[max]=temp;
		}
		for(int i:a)
			System.out.print(i+" ");		
		
	}
}