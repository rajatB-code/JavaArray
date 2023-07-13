package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class MLift_shift {
	static void rotating(int a[], int n) {
		int b[] = new int [a.length];
		
		int k= 0;
		
		for(int i = n; i<a.length; i++) {
			b[k] = a[i];
			k++;
			
		}
		for(int i =0; i<n; i++) {
			b[k+1] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array ");
		int arr[]= {10,20,30,40,50,60};
		
		System.out.println("Before rotating array " +Arrays.toString(arr));
		System.out.println("Enter rotating Number position ");
		int num = sc.nextInt();
		
		System.out.println("-----After rotating -------");
		MLift_shift.rotating(arr, num);
	}

}
