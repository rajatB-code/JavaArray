package arraysDemo1;

import java.util.Arrays;
import java.util.Scanner;

// wap to display alternate element from the array

public class ArrayAlter {
	
public void ArrayAlternate(int a[] ) {
		
		for(int i= 0; i<a.length; i++) {
			if(i % 2 == 0) {
				System.out.println(a[i]+ " ");
			}
		}
	}

    public static void main(String[] args) {
    	int a[] = new int[5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array Element : ");
		for(int i =0; i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("******************");
		
		ArrayAlter aa = new ArrayAlter();
		aa.ArrayAlternate(a);
	}


}
