package Assignment1.Problem1;

import java.util.Scanner;
/*
	1. You just need to read 5 strings from stdin and print them to stdout.
	Input Format
	Read 5 strings with one string on each line.
	Constraints
	1 <= |S| <= 10^5
	Output Format
	Print your strings to the stdout with each string in each line.
	Sample TestCase 1
	Input
	I am awesome.
	How are you?
	I m Fine.
	Ok
	Same Here
	Output
	I am awesome.
	How are you?
	I m Fine.
	Ok
	Same Here
 */
public class Ques1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the limit: ");
		//int i = scanner.nextInt();
		int i=5;
		System.out.println("Enter " + i + " strings :");
		String [] values = new String[i];
		for (int j = 0; j < values.length; j++) {
			//values[j] = scanner.nextLine();
			String temp = scanner.nextLine();
			if (1 <= temp.length() && temp.length() <=Math.pow(10.0, 5.0)) {
				values[j] = temp;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		scanner.close();
		System.out.println("Strings...");
		for (int k = 0; k < values.length; k++) {
			System.out.println(values[k]);
		}
	}
}
/*
 * Output
 * Enter 5 strings :
		I am awesome.
		How are you?
		I m Fine.
		Ok
		Same Here
	Strings...
		I am awesome.
		How are you?
		I m Fine.
		Ok
		Same Here
*/
