package Assignment3;

import java.util.Arrays;

//7. Reverse an array in place in Java
public class Problem7 {

	public static void main(String[] args) {
		int Arr[] = { 0, 15, 5, 9, 4, 8, 2, 10, 7, 3, 6};
		int	reverseArr[] = new int[Arr.length];
		int k = Arr.length-1;
		for (int i =0; i <Arr.length; i++) {
			reverseArr[k--]=Arr[i];
			
		}
		System.out.println(Arrays.toString(reverseArr));
	}

}
