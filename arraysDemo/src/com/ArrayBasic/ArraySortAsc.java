package com.ArrayBasic;

public class ArraySortAsc {
	public static void PrintArray(int arr[]) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-1; j++) {
				if(arr[j-1] >arr[j]) {
					//swap
					temp =arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};
		
		System.out.println("Array Before Bubble Sort ");
		
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		
		PrintArray(arr);
		
		System.out.println("Array After Bubble Sort ");
		
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}

}
