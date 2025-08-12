class Linear
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{10,20,30,40,50};
		Sai s=new Sai();
		s.Search(arr);
	}
}
class Sai
{
	int key=40;
	void Search(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element found at : "+i);
				break;
			}
		}

	}
		
}