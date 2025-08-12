class Main
{
	public static void main(String[] args)
	{
		int[][] a=new int[][]{{10,20,30,40},
				      {50,60},
				      {70,80,90},
				      {100}};
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				System.out.print(a[x][y]+"\t");
			}
			System.out.println();
		}
	}
}