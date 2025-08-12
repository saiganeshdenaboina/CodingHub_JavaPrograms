class Main
{	
	public static void main(String[] args)
	{
		int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int top=0,left=0,right=a[0].length-1,bottom=a.length-1;

		while(left<=right && top<=bottom)
		{
			//traverse from left to right
			for(int i=left;i<=right;i++)
			{
				System.out.print(a[top][i]+" ");
			}
			top++;

			//traverse from top to bottom
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(a[i][right]+" ");
			}
			right--;
		
			//traverse from right to left
			if(top<=bottom)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}

			//traverse from bottom to top
			if(left<=right)
			{
				for(int i=bottom;i>=top;i--)
				{
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}
	}
}