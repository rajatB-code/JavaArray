package assignment1;

//wap to find and count total number of duplicate element in an array

public class DuplicateElement {
	
	public static void main(String[] args) {
		
		int a[] = new int [] {4, 5 ,3, 4, 5,8,3,2,7};
		
		System.out.println("Duplicate element in given Array ");
		
		for(int i = 0;  i<a.length; i++) {
			for(int j= i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
