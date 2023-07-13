package com.ObjectArray;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee (int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return id+ " "+ name+ " " +salary;
	}
}


public class ObjectArr1 {
	
	public static void main(String[] args) {
		
		Employee[] em = new Employee[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee");
		
		for(int i = 0; i<em.length; i++) {
			
			System.out.println("Enter the eid");
			int eid = sc.nextInt();
			
			System.out.println("Enter the Employee Name ");
			String ename = sc.next();
			
			System.out.println("Enter the salary ");
			int sal = sc.nextInt();
			
//			Employee e = new Employee (eid , ename, sal);
//			em[i] = e; 
			
			em[i] = new Employee (eid, ename, sal);
		}
		
		System.out.println("-----------------");
		for(Employee e:em) {
			System.out.println(e);
		}
		System.out.println(".....Display Employee with more than 20000 salary ");
		
		for(int i = 0; i<em.length; i++) {
			if (em[i].salary > 20000) {
				System.out.println(em[i].id+ " "+em[i].name+ " "+em[i].salary);
			}
		}
	}

}
