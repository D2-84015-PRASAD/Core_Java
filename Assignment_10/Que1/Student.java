package p1;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
//
//	@Override
//	public int compareTo(Student o) {
//		
//		return this.rollno-o.rollno;
//	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
}
