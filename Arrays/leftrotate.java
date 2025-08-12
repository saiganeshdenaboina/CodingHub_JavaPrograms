class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80};
		int r=3;
		//left rotation
		for(int i=r;i<a.length;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<r;i++)
			System.out.print(a[i]+" ");
		System.out.println(" ");
		//right rotation
		for(int i=a.length-r;i<a.length;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<a.length-r;i++)
			System.out.print(a[i]+" ");
		
	}
}