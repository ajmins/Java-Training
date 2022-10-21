package Assignment1.Problem9;


import java.util.Scanner;

/*
	9.	In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
	Task
	Given an integer, , perform the following conditional actions:
	
	If  is odd, print Weird
	If  is even and in the inclusive range of  to , print Not Weird
	If  is even and in the inclusive range of  to , print Weird
	If  is even and greater than , print Not Weird
	Complete the stub code provided in your editor to print whether or not  is weird.
	
	Input Format
	A single line containing a positive integer, .
	
	Constraints

	Output Format
	Print Weird if the number is weird; otherwise, print Not Weird.
	
	Sample Input 0
	3
	Sample Output 0
	Weird
	Sample Input 1
	24
	Sample Output 1
	Not Weird
	Explanation
	
	Sample Case 0: 
	 is odd and odd numbers are weird, so we print Weird.
	
	Sample Case 1: 
	 and  is even, so it isn't weird. Thus, we print Not Weird.
 */
public class Ques9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");	
		int num = scanner.nextInt();
		scanner.close();
		if (num % 2 != 0 ) {
			System.out.println("Weird");
			}
		else {
			if (num >=1 && num <=30) {
				System.out.println("Not Weird");
			}
			else if (num >=31 && num <=60) {
				System.out.println("Weird");
			}
			else if (num >= 61) {
				System.out.println("Not Weird");
			}
		}
			
	}
	}
