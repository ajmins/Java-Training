package PracticeProblems.Introduction;

import java.util.Scanner;

/*
 * Membership In Strings (100 Marks)
You just need to take string and a character as an input and print 'Yes' if that character is present in that string otherwise print 'No'.

Input Format
You will be given two strings P and Q.

Constraints
1 <= P,Q <=10^3

Output Format
Print "Yes" if that character is present in that string, otherwise print "No".

Sample TestCase 1
Input
Hello Techgig
H
Output
Yes
 */
public class MembershipInStrings {
	public static void main(String args[] ) throws Exception {

		Scanner scanner = new Scanner(System.in);
			String P = scanner.nextLine();
	      String Q = scanner.nextLine();
	      if (1 <= P.length() && P.length() <= Math.pow(10.0, 3.0))
	      {
	         if (1 <= Q.length() && Q.length() <= Math.pow(10.0, 3.0))
	         {
	            if(P.contains(Q)){
	               System.out.println("Yes");  
	            }
	            else{
	               System.out.println("No");  
	            }
	         }

	      }

	   }
}
