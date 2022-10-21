package Assignment2.Problem2;

import java.util.ArrayList;

/*
 * Create a mini sample program to understand the Java Typecasting and types of java type casting
 */

//import java.util.Scanner;

public class TypeCastindExample {

	
	public static void main(String[] args) {
		implicitTypeCasting(56);
		explicitTypeCasting(5.6);
		stringToInt("10");
		intToString(25);
		autoBoxing();
		unBoxing();
		
		
	}
	private static void unBoxing() {
		ArrayList<Integer>numList= new ArrayList<Integer>();
		numList.add(7);//added primitive type int (7)
		//System.out.println("ArrayList: " + numList);
		
		int a = numList.get(0);
	    System.out.println("Primitive Value is " + a);
		
	}
	private static void autoBoxing() {
		ArrayList<Integer>numList= new ArrayList<Integer>();
		numList.add(7);//added primitive type int (7)
		 System.out.println("ArrayList of Integer type: " +numList+" of type "+ numList.getClass().getSimpleName());
		
	}
	private static void intToString(int i) {
		String value = String.valueOf(i);
		System.out.println("Int is converted into string: "+value+" of type "+value.getClass().getSimpleName());

		
	}
	private static void stringToInt(String text) {
		int num = Integer.parseInt(text);
		System.out.println("String is converted into int: "+num);

		
	}
	public static void implicitTypeCasting(int num) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter integer value:");
//		int num = scanner.nextInt();
		double value = num;
		System.out.println("Implictly converted int to double: "+value);
	}
	private static void explicitTypeCasting(double num) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter double value:");
//		double num = scanner.nextDouble();
		int value = (int)num;
		System.out.println("Explictly converted double to int: "+value);

		
	}

}
