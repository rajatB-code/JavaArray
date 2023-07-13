package assignment1;

//		5.	WAP to print reverse of an array. Also print every alternate element backwards

public class ReverseArray {
	
	public static void main(String[] args) {

		int sum =0,i;
        int arr[] ={1,2,3,4,5,6,7,9};
        for(i = 7;i>=0;i--){
        	if(i%2==0)
            System.out.print(" "+arr[i]);
        }
		
	}

}
