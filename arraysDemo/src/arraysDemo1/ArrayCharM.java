package arraysDemo1;

import java.util.Scanner;

public class ArrayCharM {
	
	public void findMaxMin(char ch[]) {
		char maxchar = ch[0];
		char minchar = ch[0];
		
		for(int i = 0; i<ch.length;i++) {
			System.out.println(ch[i] + " " +(int)(ch[i]));
			if (maxchar < ch[i]) {
				maxchar = ch[i];
			}
			else if(minchar > ch[i]) {
				minchar = ch[i];
			}
		}
		System.out.println( "mixChar = " +maxchar);
		System.out.println("minChar = " +minchar);
	}
	
	

	public static void main(String[] args) {
		
		char ch[] = new char[4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array elements char :");
		
		for(int i = 0; i < ch.length;i++) {
			
			ch[i] = sc.next().charAt(0);
			
		}
		System.out.println("******************");
		
		ArrayCharM am = new ArrayCharM();
		am.findMaxMin(ch);
		
		
	}

}
