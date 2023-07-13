package com.ArrayBasic;

import java.util.Arrays;

public class ArraySortMethod {
	
	public static void main(String[] args) {
		 int [] arr = new int[] {90,23,5,109,12,22,67 };
		 
		 Arrays.sort(arr);
		 
		 
		 System.out.println("Array sort in Ascending Order : ");
		 
		 for(int i=0; i<arr.length;i++) {
			 System.out.println(+arr[i]);
		 }
	}

}
