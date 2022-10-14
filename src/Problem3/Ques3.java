package Problem3;
/*
	 3.	By default the input is string in JAVA. 
	 You have to read the Double values from stdin and print to stdout.
	
	Input Format
	The only line of input consists of a double value.
	
	Constraints
	NA
	
	Output Format
	Print the double value with the prefix of DOUBLE.
	
	Sample TestCase 1
	Input
	3.2453
	Output
	DOUBLE 3.2453



 */

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a double number:");
		double num = scanner.nextDouble();
		System.out.println("DOUBLE " + num);;
		scanner.close();
	}
/*
 * Output
 * 	Enter a double number:
	3.2453
	DOUBLE 3.2453
 */
}

