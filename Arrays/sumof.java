class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{50,40,20,10,50,70,20,10,40,88,91};
		boolean[] b=new boolean[a.length];
		int sum=0,first=-1,last=-1,first1=-1,last1=-1;
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count==1)
			{
				if(first1==-1)
					first1=a[i];
				last1=a[i];
			}
			else if(count>1)
			{
				if(first==-1)
					first=a[i];
				last=a[i];
			}
		}
		sum=first1+last;
		System.out.println("Last duplicate : "+last);
		System.out.println("first unique element : "+first1);
		System.out.println(sum);
	
	}
}