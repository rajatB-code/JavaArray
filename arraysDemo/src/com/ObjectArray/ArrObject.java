package com.ObjectArray;

import java.util.Scanner;

class Student{
	int id;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks= marks;
	}
	public String toString() {
		return id+ " "+name+ " "+marks ;
	}
}

public class ArrObject {

	public static void main(String[] args) {
		
		Student s[] = new Student[3];
		
//		s[0] = new Student (101, "yash", 67);
//		s[1] = new Student (102, "Neha", 77.56);
//		s[2] = new Student (103, "yash", 66.45);
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Details");
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("Enter the id ");
			int sid = sc.nextInt();
			
			System.out.println("Enter the Name ");
			String sname = sc.next();
			
			System.out.println("Enter the Marks ");
			double ma = sc.nextDouble();
			
			s[i] = new Student(sid, sname, ma);
	
		}
		
		for(int i = 0; i<s.length; i++) {
//			System.out.println(s[i].id + " " +s[i].name+ " " +s[i].marks);
	        System.out.println(s[i]);
		}
		System.out.println("--------------------------");
		
		for(Student stud:s) {
			System.out.println(stud);
		}

	}

}
