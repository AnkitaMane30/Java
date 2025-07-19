package com.dkte;

public class Demo {

	public static void main(String[] args) {
		//Person p = new Person(); 
		//p.display();
		
		//Person p2 = new Person("Rohan", 32); 
		//p2.display();
		
		//Student s1 = new Student(); 
		//s1.display();
		
		Student s2 = new Student("Ketan", 31, 1, "MCA", 66);
		//s2.display();
		
		System.out.println("Name : " + s2.getName());
		System.out.println("Age  : "+s2.getAge());
		System.out.println("Roll : "+s2.getRoll());
		System.out.println("Course : "+s2.getCourse());
		System.out.println("Marks : "+s2.getMarks());

	}

}
