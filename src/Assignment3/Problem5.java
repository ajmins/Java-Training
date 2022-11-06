package Assignment3;


//5.Find duplicate numbers in an array if it contains multiple duplicates.
public class Problem5 {

	public static void main(String[] args) {
		 
		int Arr[] = { 1, 2, 2, 3, 4, 9,5, 6, 7,9,10,6,6};
		int[] duplicate = new int[Arr.length];
		int k = 0;
		for (int i = 0; i < Arr.length-1; i++) {
			for(int j = i+1; j <Arr.length-1; j++) {
				if (Arr[i] == Arr[j]) {
					duplicate[k] = Arr[j];
					k++;
				}
				
			}
			
		}
		for (int i = 0; i < duplicate.length; i++) {
			if (duplicate[i]!=0) {
				System.out.println("Duplicate Number: "+duplicate[i]);
			}
				
		}
		
	}

}
