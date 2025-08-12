class Main
{
	public static void main(String[] args)
	{
		String s1="aabb";
		String s2="aabb";

		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
			return;
		}
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Boolean flag=true;
	
		for(int x=0;x<c1.length;x++ )
		{
			int y;
			for(y=0;y<c2.length;y++)
			{
				if(c1[x]==c2[y])
				{
					c2[y]='$';
					break;
				}
			}
			if(y==c2.length)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}