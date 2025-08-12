class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,10,20,56,39,56,10,45,56};
		boolean[] b=new boolean[a.length];
		int first=-1,last=-1,first1=-1,last1=-1;
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
		System.out.println("first duplicate : "+first+"\n"+
				    "Last duplicate : "+last);
		System.out.println("first unique element : "+first1+"\n"+
				    "Last unique element : "+last1);

	}
}