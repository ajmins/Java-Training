package Assignment3;

import java.util.HashSet;

//6. Remove duplicates from a given array in Java.
public class Problem6 {

	public static void main(String[] args) {
		int Arr[] = { 1, 2, 2, 3, 4, 9,5, 6, 7,9,10,6,6};
		HashSet<Integer> uniqueSet= new HashSet<Integer>();

	    // adding elements to HashSet to removes duplicates
	    for (int i = 0; i < Arr.length; i++) {
	    	uniqueSet.add(Arr[i]);
	    }
	        
	System.out.println(uniqueSet);	
	}
		
}
