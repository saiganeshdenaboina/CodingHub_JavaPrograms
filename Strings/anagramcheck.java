class Main 
{
	public static void main(String[] args) 
	{
        	String s = "tea eat ate tae eta";
        	String[] words = s.split(" ");
        	String s2 = "tea";

        	for (int i = 0; i < words.length; i++) 
		{
            		String w = words[i];
            		if (w.length() == s2.length()) 
			{
                		boolean isAnagram = true;
                		for (int j = 0; j < s2.length(); j++) 
				{
                    			char ch = s2.charAt(j);
                    			if (w.indexOf(ch) == -1) 
					{
                        			isAnagram = false;
                       				 break;
                  		 	}
               			 }
			}
		}
                if (isAnagram) 
                    System.out.println("anagram");
		else
			System.out.println("not anagram");
		
        }
}
