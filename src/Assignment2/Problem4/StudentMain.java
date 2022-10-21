package Assignment2.Problem4;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Write a program to get the roll number and Name of N students (Hint: Create a Student class with
member variables as roll number and name).
Store in Array list using roll number ascending order. Reverse the elements of the list and store them in
TreeSet. Display the actual list and reversed list.
 */
public class StudentMain {

	
	public static void main(String[] args) {
	
	
/*//	Student student = new Student("Anu", 7);
//	Student student1 = new Student("Manu", 37);
//	Student student2 = new Student("Rahul", 44);
//	Student student3 = new Student("Dalia", 17);
*/	

	ArrayList<Student>studentList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter name & roll no");
	
	
	
	for (int i = 0; i < 5; i++) {
		System.out.print("Name:");
		String name = scanner.nextLine();
		System.out.print("RollNo:");
		int rollNo = scanner.nextInt();
		Student student = new Student(name, rollNo);
		studentList.add(student);
	}
	
//	studentList.add(student);
//	studentList.add(student1);
//	studentList.add(student2);
//	studentList.add(student3);
	displayList(studentList);
	sortList(studentList);
	//reverse
	
	}

	private static void displayList(ArrayList<Student> studentList) {
		System.out.println("Actual List: \nStudentName\t Rollnumber");
		for (Student student : studentList) {
			System.out.println(student.getStudentName() +"\t\t"+student.getRollNumber());
		}
		System.out.println();
	}

	private static void sortList(ArrayList<Student> studentList) {
		Collections.sort(studentList, Student.rollNumberList);
		System.out.println("Roll Number in Ascending Order: \nStudentName\t Rollnumber");
		for (Student student : studentList) {
			System.out.println(student.getStudentName() +"\t\t"+student.getRollNumber()); 
		}
		System.out.println();
	}
	

}
