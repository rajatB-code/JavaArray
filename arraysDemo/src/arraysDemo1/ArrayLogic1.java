package arraysDemo1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLogic1 {
	public static void main(String[] args) {
		int num = 10;
		int arr[] = {7,4,2,3 };
		
		int a[] = new int [5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Elements");
		
		for (int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
		}
       System.out.println("-----------------");
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//			//System.out.println(a);
//		}
		System.out.println("--------------------");
	
		for(int x:a)
		{
			System.out.println(x);
		}
	
		System.out.println("---------------------");
		
		System.out.println(Arrays.toString(a));
		

	}
	
 
	}

