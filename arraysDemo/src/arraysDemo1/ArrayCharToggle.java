package arraysDemo1;

import java.util.Arrays;

public class ArrayCharToggle{
	public void changeToggle(char ch[]) {
	
	for(int i = 0; i <ch.length; i++)
	{
		if(ch[i] >= 'A' && ch[i] <= 'Z') {
			ch[i]  = (char) (ch[i] + 32);
		}else if (ch[i]  >= 'a' &&  ch[i]<= 'z' ) {
			ch[i] = (char) (ch[i] - 32);
		}else {
			ch[i] = ch[i];
		}
			
		}
	System.out.println(Arrays.toString(ch));
	}
  

	public static void main(String[] args) {
		char ch[] = {'t' , 'L', 'A', 'd', 'n'};
		System.out.println(Arrays.toString(ch));
		ArrayCharToggle ac = new ArrayCharToggle();
		ac.changeToggle(ch);
	

	}
}
