import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int[][] a=new int[][]{{19,27,14,12},
				      {18,56,23},
				      {12,6,9}};
		int max=0,maxrow=0;
		for(int x=0;x<a.length;x++)
		{
			int sum=0;
			for(int y=0;y<a[x].length;y++)
			{
				sum+=a[x][y];
			}
			if(sum>max)
			{
				max=sum;
				maxrow=x;
			}
		} 
		System.out.println(max);
		for(int i:a[maxrow])
			System.out.print(i+" ");
	}
}