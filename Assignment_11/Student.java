package p1;

import java.util.Scanner;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	double marks;
	String course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, double marks, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
	
	void accept( Scanner sc) {
		System.out.println("Enter Rollno-");
		rollno=sc.nextInt();
		System.out.println("Enter Name -");
		name=sc.next();
		System.out.println("Enter Marks");
		marks=sc.nextDouble();
		System.out.println("Enter Course");
		course=sc.next();
		
	}
	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno-o.rollno;
	}
}
