package arraysDemo1;

import java.util.Scanner;

//Wap to find out the sum of odd element from the array

public class ArrayOddSum {
	int oddSum = 0;
	public void findOdd(int a[]) 
	{
		for(int i = 0;i<a.length; i++)
		{
			if(a[i]% 2 == 1)
			{
				 oddSum = oddSum + a[i];
				 System.out.println(a[i]);
			}
			
		}
		System.out.println("************");
		System.out.println("oddSum = " +oddSum);
	}		
		
		public static void main(String args[]) {
			int a[] = new int[5];
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the Array Element : ");
			for(int i =0; i<a.length;i++)
			{
				a[i]= sc.nextInt();
			}
			
			System.out.println("***********");
			
			
			ArrayOddSum as =new ArrayOddSum();
			as.findOdd(a);
		
	}

}
