package Assignment2.Problem4;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {

	private String studentName;
	private int rollNumber;
	

	
	
	public Student(String studentName, int rollNumber) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public int getRollNumber() {
		return rollNumber;
	}

	// Comparator for sorting the list by roll no
    public static Comparator<Student> rollNumberList = new Comparator<Student>() {
  
        // Method
        public int compare(Student s1, Student s2) {
  
            int rollno1 = s1.getRollNumber();
            int rollno2 = s2.getRollNumber();
  
            // For ascending order
            return rollno1 - rollno2;
  

        }
    };


	
	
}
