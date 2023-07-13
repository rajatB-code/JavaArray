package arraysDemo1;

import java.util.Arrays;

public class ArrayReplace {
	public static void main(String[] args) {
	
	char ch[] = {'t', 'u','z','A'};
	
	System.out.println(Arrays.toString(ch));
	
	for(int i = 0; i<ch.length; i++) {
		if (ch[i] >= 'a' && ch[i] <= 'x') {
			ch[i] = (char) (ch[i] + 2);
		}
		else if(ch[i] >= 'A' && ch[i] <= 'X')
		{
			ch[i] = (char) (ch[i] + 2);
		}
		else if (ch[i] == 'Z' || ch[i] == 'z' || ch[i] == 'Y' || ch[i] == 'Y' ){
			ch[i] = (char) (ch[i] - 24);
		}
	}
	System.out.println(Arrays.toString(ch));

   }
}