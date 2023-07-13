package assignment1;

//3.	WAP to search for a given number in an array and accordingly print the index if exists.

import java.util.Scanner;

public class IndexPrint {
	public static void main(String[] args) {

		int  arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 }, check = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for search: ");
		int num = sc.nextInt();
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] % num == 0) {
				System.out.println("Yes number is present");
				check = 1;
				break;
			}
		}
		if (check == 0)
			System.out.println("number is not present");
	}

}
