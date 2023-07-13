package arraysDemo1;

import java.util.Scanner;

public class Demo1 {
	
	int oddSum=0;
    public void findOdd(int a[]){
    for (int i=0; i<a.length; i++)
    {
      if (a[i] % 2 == 1)
      {
       oddSum = oddSum + a[i];
       System.out.println(a[i]);
      }
     }
    System.out.println("-------------");
}
    public static void main(String args[]){
      int a[] = new int [5];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the NUmber ");
      for(int i=0; i<a.length; i++)
      {
       a[i] = sc.nextInt();
      }
     System.out.println("------------");

     ArrayOddSum as = new ArrayOddSum();
     as.findOdd(a);
    }
 } 
	
//	public void findOdd(int a[])
//    {
//      for(int i=0; i<a.length; i++)
//       {
//          if(a[i] % 2 ==1)
//          {
//           System.out.println(a[i]);
//          }
//        }
//           System.out.println("---------");
//          }
//	
//	public static void main(String[] args){
//        int a[] = new int [5];
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the Array element  : ");
//        for(int i = 0; i<a.length; i++)
//        {
//         a[i] = sc.nextInt();
//        }
//        System.out.println("-----------");
//        
//        Demo1 ao = new Demo1();
//        ao.findOdd(a);
//      }
    

