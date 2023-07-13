package assignment1;

//4.	WAP to copy an array by iterating the array.

public class CopyByiterating {
	public static void main(String[] args) {
		

      int copy[] = {1,2,3,4,5,6};
      int copy2[] = new int[6];
      for (int j = 0; j < copy.length; j++) {
			 copy2[j]=copy[j];
		}
      for (int i : copy2) {
			System.out.println("Copy of array one: "+i);
		}
	}

}
