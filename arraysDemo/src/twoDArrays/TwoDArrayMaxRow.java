package twoDArrays;

//Wc to find out the Row wise maximum. 

public class TwoDArrayMaxRow {
	public static void main(String[] args) {
		int arr[][]= {{6,45,5},
				      {7,56,89},
				      {12,7,8}};
		
		
		for(int i=0;i<3;i++)
		{
			
			int max=arr[i][0];
			
			for(int j=0;j<3;j++)
			{
				
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
				
			}
			System.out.println(max);
		}
		

	}


}
