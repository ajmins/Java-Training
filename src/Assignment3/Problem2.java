package Assignment3;


//2.Find the duplicate number on a given integer array.
public class Problem2 {

	public static void main(String[] args) {
		int duplicate = 0;
		int Arr[] = { 1, 2, 3, 4, 9,5, 6, 7,9,10};
		
		for (int i = 0; i < Arr.length-1; i++) {
			for(int j = i+1; j <Arr.length-1; j++) {
				if (Arr[i] == Arr[j]) {
					duplicate = Arr[j];
				}
			}
			
		}
		System.out.println("Duplicate Number: "+duplicate);	
	}

}
