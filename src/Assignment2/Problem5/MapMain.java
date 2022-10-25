package Assignment2.Problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * Word count using Map
Create a String array that holds some string values. These string values can be repeated.
Example {“AAA”,”BB”,”AAA”,”C”,”BB”}
Display the occurrences of each string present in the array using a Map where the key will be the string(I
.e word name) and value will be int(i. e the count value)
 */
public class MapMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> stringValues = new ArrayList<>();
		System.out.print("Enter total number of strings: ");
		int num = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the strings: ");
		for (int i = 0; i < num; i++) {
			String temp = scanner.nextLine();
			stringValues.add(temp);
		}
		scanner.close();
		listCount(stringValues);
		

	}

	private static void listCount(ArrayList<String> stringValues) {
		Map<String,Integer> stringCountMap=new HashMap<String,Integer>();
		for (String text : stringValues) {
			if (stringCountMap.containsKey(text)) {
				stringCountMap.put(text, stringCountMap.get(text)+1);
			}
			else {
				stringCountMap.put(text, 1);
			}
		}
		//display
		System.out.println("Text : Count\n");
		//stringCount.entrySet().forEach(System.out::println);
		stringCountMap.entrySet().forEach(entry -> System.out.println(
				  entry.getKey() + " : " + entry.getValue()));
		
	}

}