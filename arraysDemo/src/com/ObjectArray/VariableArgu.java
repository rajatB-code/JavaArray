package com.ObjectArray;

public class VariableArgu{
	void show(String str, int... a) {
		System.out.println(str);
//		int len = a.length;

//		System.out.println(a[len + 1]);
		 for(int x:a)
		 {
		 System.out.println(x);
		 }
	}

	public static void main(String[] args) {

		VariableArgu vv = new VariableArgu();
		vv.show("nashik", 12);
		System.out.println("--------------------");
		vv.show("mumbai", 1, 2,3, 2);
		System.out.println("---------------------");
		vv.show("pune", 4,5);

	}

}
