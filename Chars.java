import java.util.Scanner;
public class Chars
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter character:");
		char ch=input.next().charAt(0);
		System.out.println("Before change :"+ch);
		if(ch>='a'&& ch<='z')
		{
			char c=(char)(ch-32);	
			System.out.println("After chaange :"+c);
		}else if(ch>='A'&&ch<='Z')
		{
			char f=(char)(ch+32);
			System.out.println("After chaange:"+f);
		}else if(ch>= '0' && ch<='9')
		{
		
			System.out.println("After change "+ch);
		}else
		{
			System.out.println("special Symbols:"+ch);
		}
		input.close();
	}
}