package Assignment3;

//3.Find the largest and smallest number in an unsorted integer array.
public class Problem3 {

	public static void main(String[] args) {
		int Arr[] = { 15, 5, 9, 4, 8, 2, 10, 7, 3, 6};
		int small = 0;
		int large = 0;
		for (int i = 0; i < Arr.length-1; i++) {
			small = Arr[0];
			large = Arr[0];
			
			for (int j = 0; j < Arr.length-1; j++) {
				if (small > Arr[j]) {
					small = Arr[j];
				}
				if (large < Arr[j]) {
					large = Arr[j];
				}
				
			}
		}
		System.out.println("Small: "+small+ " Large: "+large);

	}

}
