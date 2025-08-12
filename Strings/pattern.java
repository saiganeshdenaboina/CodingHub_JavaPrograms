class Main
{
	public static void main(String[] args)
	{
		String s="a2b3c8";

		StringBuffer result=new StringBuffer();
		StringBuffer temp=new StringBuffer();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetter(ch))
				temp.append(ch);
			else if(Character.isDigit(ch))
			{
				int count=ch-'0';
				for(int j=0;j<count;j++)
				{
					result.append(temp);
				}
				temp.setLength(0);
			}
		}
		System.out.println(result.toString());
		
	}
}