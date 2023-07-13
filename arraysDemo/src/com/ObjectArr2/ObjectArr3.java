package com.ObjectArr2;

import java.util.Scanner;

class Course2 {
	private int cid;
	private int cfees;
	
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCfees(int cfees) {
		this.cfees = cfees;
	}
	
	public int getCid() {
		return cid;
	}
	public int getCfees() {
		return cfees;
	}
	
}

class Student1{
	
	 int sid;
     String sname;
     Course2 c;
     
	public void setId(int id) {
		this.sid = id;
	}
	public void setName(String name) {
		this.sname = name;
	}
	public void setC(Course2 c) {
		this.c = c;
	}
	
	public int getId() {
		return sid;
	}
	public String getName() {
		return sname;
	}
	public Course2 getC() {
		return c;
	}
	
}


public class ObjectArr3 {

	public static void main(String[] args) {
		
		Student1 s[] = new Student1[2];
		Scanner sc = new Scanner (System.in);
		
		for(int i= 0; i<s.length; i++) {
			
			System.out.println("Enter the student id ");
			int sid = sc.nextInt();
			System.out.println("Enter the Student Name ");
		    String  sname = sc.next();
		    System.out.println(" Enter the Course id ");
		    int cid = sc.nextInt();
		    System.out.println("Enter the Course fees");
		    int cfees = sc.nextInt();
		    
		    Student1 s1 = new Student1();
		    s1.setId(sid);
		    s1.setName(sname);
		    s1.setC(new Course2());
		    s1.getC().setCid(cid);
		    s1.getC().setCfees(cfees);
		    
		    s[i] = s1;
		}
		System.out.println("---------------------");
		
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i].getId());
			System.out.println(s[i].getName());
			System.out.println(s[i].getC().getCid());
			System.out.println(s[i].getC().getCfees());
		}
		System.out.println("-----------------------");
		
		for(Student1 ss : s) {
			System.out.println(ss.getId()+" " +ss.getName()+" "+ss.getC().getCid()+" "+ss.getC().getCfees());
		}

	}

}
