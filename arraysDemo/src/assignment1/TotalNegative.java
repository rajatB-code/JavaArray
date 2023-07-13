package assignment1;

import java.util.Arrays;

// wap to print all negative element in array and also count total number
// of negative element in an array

public class TotalNegative {
	public static void main(String[] args) {
		int  count = 0;
		int arr[] = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
		
		System.out.println("Array element are " +Arrays.toString(arr));
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] < 0) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("Total number of Negative Element : " +count);
		
		
	}

}
