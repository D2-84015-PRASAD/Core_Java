package p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int choice;
		int n;
		System.out.println("Enter No. of Students -");
		n = sc.nextInt();
		Student[] arr = new Student[n];

		do {
			System.out.println("0 : Exit!");
			System.out.println("1 : Add Student");
			System.out.println("2 : Display Students Sorted by Rollno");
			System.out.println("3 : Display Students Sorted by Name");
			System.out.println("4 : Display Students Sorted by Marks Desc");
			System.out.println("5 : Display Students Sorted by Course");
			System.out.println("Enter Choice ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!!!");
				break;

			case 1:
				if (counter < n) {
					arr[counter] = new Student();
					arr[counter].accept(sc);
					counter++;
				} else {
					System.out.println("Array is Full!!!");
				}
				break;

			case 2:

				Arrays.sort(arr);
				for (Student student : arr) {
					if (student != null)
						System.out.println("Students =" + student);
				}
				break;

			case 3:
				class StudentName implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.name.compareTo(o2.name);
					}

				}
				StudentName sn = new StudentName();

				Arrays.sort(arr, sn);

				for (Student std : arr) {
					System.out.println("Students=" + std);
				}
				break;

			case 4:
				class StudentMarks implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						return Double.compare(o2.marks, o1.marks);
					}

				}
				StudentMarks sm = new StudentMarks();

				Arrays.sort(arr, sm);
				for (Student std : arr) {
					System.out.println("Students =" + std);
				}
				break;

			case 5:
				class StudentCourse implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.course.compareTo(o2.course);
					}

				}

				StudentCourse scc = new StudentCourse();
				Arrays.sort(arr, scc);

				for (Student std : arr) {
					System.out.println("Students =" + std);
				}
				break;

			default:
				break;
			}

		} while (choice != 0);
	}

}
