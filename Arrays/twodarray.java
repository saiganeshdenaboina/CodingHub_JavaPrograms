class Main
{
	public static void main(String[] args)
	{
		int[][] a=new int[][]{{10,20,30,40},{60,70,80}};
		int[][] b=new int[][]{{19,29,38,48},{47,56,13}};
		int[][] c=new int[a.length][];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"/t");
			}
			System.out.println();
		}
		
	}
}