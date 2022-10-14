package Problem2;

import java.util.Scanner;

/*
 * 2.	Conversion
		The conversion can be of two types - Explicit or Implicit. 
		Sometimes the conversions are necessary to get the desired output. 
		This challenge is to test if you can successfully convert an integer to a string or not.
		
		Input Format
		The only line of input consist of an integer, N
		
		Constraints
		-20<= N <= 20
		
		Output Format
		Print Successful Conversion if the integer is Successfully converted else print Conversion Unsuccessful.
		
		Sample TestCase 1
		Input
		10
		Output
		Conversion Successful


 */

public class Ques2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number:");
		int num = scanner.nextInt();
		if (num >=-20 && num <= 20 ) {
			String testType= Integer.toString(num).getClass().getSimpleName();
			//System.out.println(testType);
			if (testType.equals("String")) {
				System.out.println("Successful Conversion.");
			}
			else {
				System.out.println("Unsuccessful Conversion.");
			}
		}
		else {
			System.out.println("Invalid input.");
		}
		scanner.close();
	}
/*
 * 	Output
 * case1:
 * 	Enter an integer number:
	10
	Successful Conversion.
	
	case2:
	Enter an integer number:
	25
	Invalid input.

 */
}
