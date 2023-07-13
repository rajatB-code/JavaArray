package twoDArrays;



public class TwoDArray1 {
	
	public static void rowSum(int a[][]) 
	{
		for(int i=0; i< a.length;i++) 
		{
			int rsum = 0;
			for(int j= 0; j<a[i].length; j++) 
			{
				rsum = rsum + a[i][j];
				System.out.println(a[i][j]+ " ");
			}
			System.out.print("  rsum = " +rsum );
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = {{3, 4, 5},
				      {8, 5, 1},
				      {4, 2, 3}};
		TwoDArray1.rowSum(arr);
	
	}	

}
