class Main
{
	public static void main(String[] args)
	{
		int count=0;
		int[] a=new int[]{139,12,34,5,566,7};
		char[] ch=new char[]{'c','3','(','?'};
		String[] s=new String[]{"hello","all","good","Morning","453","?<>|+"};
		boolean[] b=new boolean[]{true,false,true,false,true,true};
		
		for(int i=0;i<a.length;i++)
				System.out.print(a[i]+"\t");

		for(int i=0;i<ch.length;i++)
				System.out.print(ch[i]+"\t");

		for(int i=0;i<s.length;i++)
				System.out.print(s[i]+"\t");

		for(int i=0;i<b.length;i++)
				System.out.println(b[i]+"\t");
		for(int n:a)
		{
			
			System.out.println(n);
			count++;
		}
		System.out.println("count :"+count);		

	}
}