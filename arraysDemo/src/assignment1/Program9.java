package assignment1;

import java.util.Arrays;

public class Program9 {
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Original Array : " +Arrays.toString(arr));
		
		int se=0,so=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				se++;
			}
			else
			{
				so++;
			}
		}
		int e=0,o=0;
		int even[]=new int[se];
		int odd[]=new int[so];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even[e]=arr[i];
				e++;
			}
			else
			{
				odd[o]=arr[i];
				o++;
			}
		}
		System.out.println("Even array: "+Arrays.toString(even));
		System.out.println("Odd array: "+Arrays.toString(odd));
	}

}
