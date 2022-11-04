package Assignment3;
//4.Find all pairs of an integer array whose sum equals a given number.
public class Problem4 {

	public static void main(String[] args) {
		int value = 10; //0,10 	8,2 	7,3	 	6,4
		int Arr[] = { 0, 15, 5, 9, 4, 8, 2, 10, 7, 3, 6};

		System.out.println("Pairs that sums "+value);
		for (int i = 0; i < Arr.length-1; i++) {
			for(int j = i+1; j <Arr.length-1; j++) {
				if ((Arr[i]+Arr[j]) == value) {
					System.out.println(Arr[i]+","+Arr[j]);
				}
			}
			
		}
	}

}
