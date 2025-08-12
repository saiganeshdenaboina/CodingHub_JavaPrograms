class Main
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{10,20,30,40,50};
		Main m=new Main();	
		m.binary(arr,0,arr.length-1,40);
	}
	void binary(int[] arr,int left,int rigth,int target)
	{
		if(left>rigth)	
		{
			System.out.println("element not found");
		}
		else
		{
			int mid=(left+rigth)/2;
	
			if(arr[mid]<target)
				binary(arr,mid+1,rigth,target);
			else if(arr[mid]>target)
				binary(arr,left,mid-1,target);
		        else
				System.out.println("element found");
		}
			
	}
}