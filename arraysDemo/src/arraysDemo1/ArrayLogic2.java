package arraysDemo1;

public class ArrayLogic2 {
	public static void SumofElement(int arr[]) {
		int sum = 0;
		for(int i = 0; i<arr.length;i++) 
		{
			sum = sum + arr[i];
			
		}
		System.out.println("sum = " +sum);
	}	
		public static void main(String[] args) {
			
			int a[] = {6, 2, 4, 1, 8};
			
//			int a[] = {6, 2, -4, 1, 8};  // sum =  13
			
			ArrayLogic2.SumofElement(a);
		
	}

}
