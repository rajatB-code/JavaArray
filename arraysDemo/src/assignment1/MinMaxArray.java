package assignment1;

//wap to find out the minimum value in an array

public class MinMaxArray {
	public static void main(String[] args) {
		int []arr = new int[]{11,62,3,14,50,63,71,89};
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
	         if(arr[i]<min) {
	        	 min = arr[i];
	         }
	         
	    }
	     System.out.println("The minimum value in array: "+min);
	     
	     for(int i=0;i<arr.length;i++)
			{
		         if(arr[i]>max) {
		        	 max = arr[i];
		         }
		         
		    }
		     System.out.println("The maximum value in array: "+max);
	
	}
}
