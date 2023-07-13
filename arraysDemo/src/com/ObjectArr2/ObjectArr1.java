package com.ObjectArr2;

import java.util.Arrays;
import java.util.Scanner;

//Create class of Student which has id,name, and int type marks array. create Array and display it.

class Student{
	int sid;
	String sname;
	int[] marks;
	
	Student(int sid, String sname, int[]marks){
		this.sid=sid;
		this.sname= sname;
		this.marks = marks;
	}
	public String toString() {
		return sid+ " " +sname+ " " +Arrays.toString(marks);
	}
}

public class ObjectArr1 {
	
	public static void main(String[] args) {
		
		Student s[] = new Student[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<s.length;i++) {
			System.out.println("Enter the Student id ");
			int sid = sc.nextInt();
			System.out.println("Enter the Student Name ");
			String sname= sc.next();
			System.out.println("Enter the Marks ");
			int[] mk = new int[2];
			
			for(int j = 0; j<mk.length; j++) {
				mk[j] = sc.nextInt();
			}
			s[i] = new Student(sid, sname, mk);
		}
		System.out.println("--------------------");
		for(int i =0; i< s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
