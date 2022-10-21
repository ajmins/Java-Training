package Assignment1.Problem5;


import java.util.Scanner;

/*
	5. 	MULTIPLY 
	Aahan is doing homework where he has to find the product of N integers. 
	The problem is, he missed the class of MULTIPLICATION and don't know how to do it. 
	Can you write a code to help him?
	
	Input Format
	The first line of input consist of number of integers, N.
	
	The second line of input consist of N space separated integers.
	
	Constraints
	1<= N <=10
	
	1<= Integer <=25
	
	
	Output Format
	Print the product of N integers.
	
	Sample:
	Input: 5
	1 2 3 4 5 
	
	Output: 120



 */
public class Ques5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int product = 1;
		boolean flag = false;
		System.out.println("Enter total no of integers:");
		int num = scanner.nextInt();
		if (num >=1 && num <=10) {
			System.out.println("Enter the integers seperated by spaces: ");
			for (int i = 0; i < num; i++) {
				int values = scanner.nextInt();
				if (values >=1 && values<=25) {
					product *= values;
					flag = true;
				}
				else {
					System.out.println("Invalid Input");
					flag = false;
					break;
				}
			}
			scanner.close();
			if (flag == true) {
				System.out.println("Product: "+product);
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	/*
	  	Enter no of integers:
		5
		Enter the integers seperated by spaces: 
		1 2 3 4 5
		Product: 120
	 */
}
