/*
class Main
{
	public static void main(String[] args)
	{
		String s="hello";
		for(int i=0;i<s.length();i++)
		{
			
			for(int y=i+1;y<=s.length();y++)
			{
				System.out.println(s.substring(i,y));
			}
			
		}
	
	}
}
*/
/*
class Main
{
	public static void main(String[] args)
	{
		String s="hello all";
		for(int i=0;i<s.length();i++)
		{
			
			for(int y=i+1;y<=s.length();y++)
			{
				String sub=s.substring(i,y);
				boolean vowel=false;
				for(int k=0;k<sub.length();k++)
				{
					char ch=sub.charAt(k);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						vowel=true;
						break;
					}
				}
				if(!vowel)
					System.out.println(sub);
			}
			
		}

	}
}
*/
class Main 
{
	public static void main(String[] args)
	{
		String s="hello all good hello all good";
		String[] a=s.split(" ");
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			s1=a[i];
			if(s.indexOf(s1)==s.lastIndexOf(s1))
			{
				System.out.println(s1);
			}	
		} 
		
	}
}




















