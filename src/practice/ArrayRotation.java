package practice;

public class ArrayRotation {
	
	static int[] a = {1,2,3,4};
	static int[] temps = new int[9];
	
	public static void sige(int[] a, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<a.length; j++) {
				int temp = a[a.length-1];
				
				temps[j+1] = a[j];
				a[j] = temps[j];
				
				a[0] = temp;
			}
		}
		
	}
	
	public static void bansige(int[] a, int n) {
		for(int i=0; i<n; i++) {
			for(int j=a.length-1; j>=0; j--) {
				int temp = a[0];
				temps[a.length] = temp;
				
				temps[j] = a[j];
				a[j] = temps[j+1];
			}
		}
		
	}

	public static void main(String[] args) {
		
		sige(a, 1);
		
		//bansige(a, 3);
		
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		

	}

}
