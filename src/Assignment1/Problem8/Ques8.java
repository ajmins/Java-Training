package Assignment1.Problem8;

import java.util.Scanner;

/*
	8.	Reading Input and Printing
	The input is read from stdin and printed to stdout. The challenges requires you to read input from stdin and print to stdout. 
	
	Input can be read using the BufferedReader class or the Scanner class.
	
	Input Format
	The first line of input consist of a string.
	
	Next 2 lines consist of an integer.
	
	Constraints
	1<= |string| <=10
	
	1<= Integer <=50
	
	Output Format
	Print the input read to stdout in the similar format in separate lines.
	
	Sample TestCase 1
	Input
	practice
	10
	Output
	practice
	10


 */
public class Ques8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String text = scanner.nextLine();
		if (text.length()>=1 && text.length()<=10) {
			System.out.println("Enter an integer:");
			int num = scanner.nextInt();
			if (num>=1 && num<=50) {
				System.out.println(text +"\n"+num);
			}
			else {
				System.out.println("Invalid input");
			}
		}
		else {
			System.out.println("Invalid input");
		}
		scanner.close();
	}
	/* Output
	  	Enter a string:
		Input
		Enter an integer:
		10
		Input
		10

	 */

}
