package Assignment1.Problem6;

/*
6.	SUMMATION
Rohan wants to find the summation of N integers. 
But he don't know how to do that. Can you Help Rohan find the summation ?

Input Format
The first line of input consists of number of integers, N.

The second line of input consist of N space separated integers.

Constraints
1<= N <=10

1<= Ai <=50

Output Format
Print the summation of N integers.

Sample TestCase 1
Input
5
1 2 3 4 5 
Output
15


*/

import java.util.Scanner;

public class Ques6 {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	boolean flag = false;
	System.out.println("Enter total no of integers:");
	int num = scanner.nextInt();
	if (num >=1 && num <=10) {
		System.out.println("Enter the integers seperated by spaces: ");
		for (int i = 0; i < num; i++) {
			int values = scanner.nextInt();
			if (values >=1 && values<=50) {
				sum += values;
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
			System.out.println("Sum: "+sum);
		}
	}
	else {
		System.out.println("Invalid Input");
	}

}
/*
* Output
Enter total no of integers:
	10
Enter the integers seperated by spaces: 
	1 2 3 4 5 6 7 8 9 10
Sum: 55
*/
}
