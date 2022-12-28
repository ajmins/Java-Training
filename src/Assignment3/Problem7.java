package Assignment3;

import java.util.Arrays;

//7. Reverse an array in place in Java
public class Problem7 {

	public static void main(String[] args) {
		int Arr[] = { 0, 15, 5, 9, 4, 8, 2, 10, 7, 3, 6}; 
		//[6, 3, 7, 10, 2, 8, 4, 9, 5, 15, 0]
		//seperateArray(Arr);
		sameArray(Arr);
		
	}

	private static void sameArray(int[] Arr) {
		int j=Arr.length;
		int temp;
		for (int i = 0; i < Arr.length/2; i++) {
			
				temp = Arr[i];
				System.out.println(temp +":\t"+ Arr[i]);
				Arr[i]=Arr[j-1-i];
				System.out.println(Arr[i] +":\t"+ Arr[j-1-i]);
				Arr[j-1-i]= temp;
				System.out.println(Arr[j-1-i] +":\t"+ temp);
			}
			
		System.out.println(Arrays.toString(Arr));
		
	}

	private static void seperateArray(int[] Arr) {
		int	reverseArr[] = new int[Arr.length];
		int k = Arr.length-1;
		for (int i =0; i <Arr.length; i++) {
			reverseArr[k--]=Arr[i];
			
		}
		System.out.println(Arrays.toString(reverseArr));
		
	}

}
