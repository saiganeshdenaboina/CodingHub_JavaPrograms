class Main 
{
	public static void main(String[] args)
	{
		String s="hello all hello java all java java hii hello";
		String[] a=s.split(" ");
		boolean[] b=new boolean[a.length]; 
		int max=0;
		String maxindex="";
		for(int i=0;i<a.length;i++)
		{
			if(b[i])
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					b[j]=true;
				}
			}
			if(count>max)
			{
				max=count;
				maxindex=a[i];
			}
			else if(count==max)
			{
				maxindex+=" "+a[i];
			}
		}
		System.out.println(max+" -->"+maxindex);

	}
}
	