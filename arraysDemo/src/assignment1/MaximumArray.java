package assignment1;

//		10.	WAP to find the maximum value in an array

public class MaximumArray {
	
	public static void main(String[] args) {

	int i, a[] = {11,62,3,14,50,63,71,89},j,temp;
  for(i=0;i<a.length;i++)
  {
      for(j=i+1;j<a.length;j++)
      {
          if(a[i]<a[j])
          {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
          }
      }
  
	}
  System.out.println("The maximum value in array: "+a[0]);
 }
	
}


