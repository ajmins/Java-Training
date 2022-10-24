package Assignment2.Problem4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

/*
 * Write a program to get the roll number and Name of N students (Hint: Create a Student class with
member variables as roll number and name).
Store in Array list using roll number ascending order. Reverse the elements of the list and store them in
TreeSet. Display the actual list and reversed list.
 */
public class StudentMain {

	
	public static void main(String[] args) {
//	Student student0 = new Student("Anu", 7);
//	Student student1 = new Student("Manu", 37);
//	Student student2 = new Student("Riya", 44);
//	Student student3 = new Student("Dalia", 17);
//	Student student4 = new Student("Felix", 23);

	ArrayList<Student>studentList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter total number of students: ");
	int num = scanner.nextInt();
	scanner.nextLine();
	for (int i = 0; i < num; i++) {
		System.out.print("Name:");
		String name = scanner.nextLine();
		System.out.print("RollNo:");
		int rollNo = scanner.nextInt();
		scanner.nextLine();
		Student student = new Student(name, rollNo);
		studentList.add(student);
	}
	scanner.close();
	displayList(studentList);
	sortList(studentList);
	reverseList(studentList);
	}

	private static void reverseList(ArrayList<Student> studentList) {

        TreeSet<Student> ts = new TreeSet<Student>(new ListComparator());
        // add ArrayList elements to TreeSet
        ts.addAll(studentList);
       // System.out.println("Size: "+ts.size());
 
        System.out.println("\nAfter Sorting : Descending order");
        for (Student student : ts) {
			System.out.println(student.getStudentName() +"\t\t"+student.getRollNumber()); 
		}
		System.out.println();

	}
	public static class ListComparator implements Comparator<Student>  {

		@Override
		public int compare(Student o1, Student o2) {
		    if (o1.getRollNumber() < o2.getRollNumber())
	            return 1;
	        if (o1.getRollNumber() > o2.getRollNumber())
	            return -1;
	        return 0;
		}
		
	}
	private static void displayList(ArrayList<Student> studentList) {
		System.out.println("\nActual List: \nStudentName\t Rollnumber");
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
