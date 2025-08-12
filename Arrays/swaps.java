class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60};
		Swap s=new Swap();
		for(int temp:s.array(a))
			System.out.print(temp+" ");
		
	}
}
class Swap
{
	int[] array(int[] a)
	{
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		return a;
	}
}