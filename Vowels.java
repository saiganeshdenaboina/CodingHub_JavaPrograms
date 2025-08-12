import java.util.Scanner;
public class Vowels
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any Character : ");
		char ch=input.next().charAt(0);

		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?("vowel"):("consonent"));
	}
}