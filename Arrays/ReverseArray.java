class ReverseArray
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{10,20,30,40,50};
		Reverse r=new Reverse();
		r.Revarray(arr);	
	}
}
class Reverse
{
	void Revarray(int[] arr)
	{
		int start=0,end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int num:arr)
			System.out.print(num+" ");
	}
}