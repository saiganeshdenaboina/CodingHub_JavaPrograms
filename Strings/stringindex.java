class Main
{
	public static void main(String[] args)
	{
		String[] a=new String[]{"hello","all","good","morning","how","are","you"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+2;j<a.length;j+=2)
			{
				if(i%2==0)
				{
					if(a[i].length()>a[j].length())
					{
						String temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		for(String x:a)
			System.out.print(x+"  ");
		
	}
}