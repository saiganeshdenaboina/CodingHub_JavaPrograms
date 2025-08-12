class Main
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{6,3,1,5,9,25,16,12};
		System.out.print("Original Array: ");
        	for (int i : arr)
           		System.out.print(i + " ");

        	mergesort(arr, 0, arr.length - 1);

        	System.out.print("\nSorted Array: ");
        	for (int i : arr)
            		System.out.print(i + " ");
	}
	public static void mergesort(int[] arr,int left,int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right);

			merge(arr,left,mid,right);
			
		}
	}	

	public static void merge(int[] arr,int left,int mid,int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;

		int[] leftarray=new int[n1];
		int[] rightarray=new int[n2];

		for(int i=0;i<n1;i++)
			leftarray[i]=arr[left+i];
		for(int j=0;j<n2;j++)
			rightarray[j]=arr[mid+1+j];

		int i=0,j=0,k=left;

		while(i<n1 && j<n2)
		{
			if(leftarray[i]<=rightarray[j])
				arr[k++]=leftarray[i++];
			else
				arr[k++]=rightarray[j++];
		}

		while(i<n1)arr[k++]=leftarray[i++];
		while(j<n2)arr[k++]=rightarray[j++];
	}
}