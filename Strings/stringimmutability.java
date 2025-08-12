//string immutability
class Main
{
	public static void main(String[] args)
	{
		String s1="hello all";
		s1.toUpperCase();
		System.out.println(s1+"original string with address "+System.identityHashCode(s1));//this case it cant change because we are just change the s1 but it never change.
		s1=s1.toUpperCase();
		System.out.println(s1+"changed string with address "+System.identityHashCode(s1));//in this case it changes the original string to uppercase string and gives different address because we are reassign the s1 but the original s1 is not change .so the original array is deleted and it points to another address which is present in uppercase string.
		StringBuffer sb=new StringBuffer("hello all");
		sb.append("good evening");
		System.out.println(sb+"original string with address "+System.identityHashCode(sb));
	}
}