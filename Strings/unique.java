class Main
{
	public static void main(String[] args)
	{
		String s="hello all good morning";
		s=s.replaceAll(" ","");
		StringBuffer sb=new StringBuffer();

		int[] a=new int[256];
		for(int i=0;i<s.length();i++)
			a[s.charAt(i)]++;
		System.out.println("Frequency of all characters : ");
		for(int i=0;i<a.length;i++)
			if(a[i]>0)
				System.out.println((char)i+"==>"+a[i]);
		
		System.out.print("Unique Characters : ");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
				System.out.print(ch+" ");
		}
		System.out.println();
		
		System.out.print("Duplicate Characters : ");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch) && sb.indexOf(String.valueOf(ch))==-1)
			{
				sb.append(ch).append(" ");	
			}
			
		}
		System.out.print(sb);
	}
}