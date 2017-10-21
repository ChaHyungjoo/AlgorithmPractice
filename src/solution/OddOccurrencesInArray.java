package solution;

public class OddOccurrencesInArray {
	
	public static int ooia(int[] A) {
		
		int temp = 0;
		
		for(int i=0; i<A.length; i++) {
			
			temp ^= A[i];
			
		}
		
		return temp;
	}

	public static void main(String[] args) {
		
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		
		System.out.println(ooia(A));

	}

}
