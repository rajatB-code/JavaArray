package assignment1;

//2. WAP to accept dimension of 1D array and create and accept data in that array. 
//Calculate the average value of array elements.

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		System.out.println("Enter the number of array: ");
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i : array) {
			temp = temp + i;
		}
		System.out.println("Average of array elements: " + temp / 2);
	}

}
