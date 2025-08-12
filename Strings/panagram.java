class Main
{
	public static void main(String[] args)
	{
		String s="Th quick brown fo jumps oer the lazy do";
		s=s.toLowerCase();
		char[] a=s.toCharArray();
		boolean[] b=new boolean[26];
		for(int i=0;i<a.length;i++)
		{
			char ch=a[i];
			if(ch>='a'&&ch<='z')
			{
				b[ch-'a']=true;
			}
		}
		boolean found=true;
		StringBuilder miss=new StringBuilder();
		for(int i=0;i<b.length;i++)
		{
			if(!b[i])
			{
				found=false;
				miss.append((char) (i + 'a')).append(" ");
			}
		}
		if(found)
			System.out.println("panagram");
		else
		{
			System.out.println("not panagram");
			System.out.println("missing letters : "+miss.toString());
		}
		
	}
}