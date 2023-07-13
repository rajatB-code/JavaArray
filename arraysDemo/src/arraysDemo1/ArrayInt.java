package arraysDemo1;

import java.util.Scanner;

//find out the max element and min element from the integer type of array

public class ArrayInt {
	
	public void findMaxMin(int a[]) {
		int max = a[0];
		int min = a[0];
		
		for(int i = 1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			else if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("The Maximum Array element : " +max);
		System.out.println("The Manimum Array element : " +min);
	}

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		
		for(int i = 0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("_________________________");
		
		ArrayInt ac = new ArrayInt();
		ac.findMaxMin(a);

	}

}
