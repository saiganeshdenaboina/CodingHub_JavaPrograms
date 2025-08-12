class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80};

		linear l=new linear();
		l.search(a);
	}
}
class linear
{
	void search(int[] a)
	{
		int found=60,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==found)
			{
				System.out.println("Element Found");
				break;
			}
		}
		if(i>=a.length)
			System.out.println("Element Not Found");
	}
}