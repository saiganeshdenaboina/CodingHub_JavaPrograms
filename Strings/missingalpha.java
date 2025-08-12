class Main
{
	public static void main(String[] args)
	{
		String s="a quick brown fox jumps over lazy dog";
		
		boolean allfound=true;
		for(char ch='a';ch<='z';ch++)
		{
			boolean miss=true;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==ch)
				{
					miss=false;
					break;
				}
			}
			if(miss)
			{
				System.out.print(ch+" ");
				allfound=false;
			}
		}
		if(allfound)
			System.out.println("contains all alphabets");
		
		
	}
}