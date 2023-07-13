package com.ObjectArray;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},
				      {4,5,6},
			   	      {6,7,8}};
	
		int a[][] = new int [2][2];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements ");
		for(int i=0; i<a.length; i++) 
		{
			for(int j=0; i<a[i].length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("--------------");
		
		for(int i= 0; i<a.length; i++) {
			for(int j=0; i<a[i].length; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}

	System.out.println("------------");

	for(int x[]:a)
	{
		for(int e:x)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	}
}