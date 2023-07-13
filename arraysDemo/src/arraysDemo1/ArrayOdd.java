package arraysDemo1;

import java.util.Scanner;

//Wc to display odd element from the array

public class ArrayOdd {
	
	public void findOdd(int a[]) 
	{
		for(int i = 0;i<a.length; i++)
		{
			if(a[i]% 2 == 1)
			{
				 System.out.println(a[i]);
			}
			
		}
		System.out.println("************");
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
			
			
			ArrayOdd ao =new ArrayOdd();
			ao.findOdd(a);
		
	}

}
