class Main
{
	public static void main(String[] args)
	{
		String s="Hello all good morning";
		s=s.toLowerCase();
		char[] a=s.toCharArray();
		boolean[] b=new boolean[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(b[x] || a[x]==' ')
				continue;
			int count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1)
				System.out.println(a[x]+"-->"+count);
			if(count==1)
			{
				System.out.print(a[x]+" ");
				return;
			}	
			//System.out.println(a[x]+"-->"+count);
			
		}
		
	}
}