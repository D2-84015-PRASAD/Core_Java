package p1;

import java.util.Arrays;

public class Test1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = { new Student(5, "Prasad", 91), new Student(2, "Dhanu", 98), new Student(4, "Syush", 90),
				new Student(3, "Rohan", 97), new Student(1, "Akash", 95),

		};
		System.out.println("Array before sorting---------------");
		// System.out.println(Arrays.toString(arr));
		for (Student element : arr) {
			System.out.println("Student-" + element);
		}

		Arrays.sort(arr);

		System.out.println("Array after sorting----------------");

		for (Student element : arr) {
			System.out.println("Student-" + element);
		}
	
	}

}
