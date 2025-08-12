import java.util.Arrays;
class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,29,36,19,100,15,57,82};
		int l=0,r=a.length-1,mid=0,search=82;
		boolean flag=false;
		
		//Arrays.sort(a); 

		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int x:a)
			System.out.print(x+" ");

		System.out.println();			
		while(l<=r)
		{
			mid=(l+r)/2;
			if(a[mid]<search)
				l=mid+1;
			else if(a[mid]>search)
				r=mid-1;
			else
			{
				flag=true;
				break;
			}
				
		}
		if(flag)
			System.out.println("Element found at "+(mid));
		else
			System.out.println("Element not found");		
	}
}