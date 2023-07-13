package arraysDemo1;

import java.util.*;
import java.util.Arrays;


//find the even elements from the array


public class ArrayEven {
		public void findEven(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
				}
			}
			
			System.out.println("----------");
			
//			for(int num:a)
//			{
//				if(num%2==0)
//				{
//					System.out.println(num);
//				}
//			}
		}
		

		public static void main(String[] args) {
		
			int a[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("-----------");
			ArrayEven ae=new ArrayEven();
			ae.findEven(a);

		}

}
