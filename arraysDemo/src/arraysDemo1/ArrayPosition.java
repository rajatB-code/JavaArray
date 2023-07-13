package arraysDemo1;

import java.util.Scanner;

public class ArrayPosition {
	
	public void ArrayP(int a[]){
		for(int i = 0;i<a.length; i++)
		{
			if(a[i]% 2 == 1)
			{
				i= i+2;
			}
			System.out.println(a[i]);
	    }
	}
	
	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array Element : ");
		
		for(int i =0; i<a.length;i= i++)
		{
			a[i]= sc.nextInt();
	    }
		System.out.println("***********");
		
		ArrayPosition ap = new ArrayPosition();
		ap.ArrayP(a);
		
		

	}
}
