package practice;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8};
		int[] temps = new int[9];
		
		/*for(int i=0; i<8; i++) {
			for(int j=0; j<a.length; j++) {
				int temp = a[a.length-1];
				
				temps[j+1] = a[j];
				a[j] = temps[j];
				
				a[0] = temp;
			}
		}*/
		
		for(int i=0; i<3; i++) {
			for(int j=a.length-1; j>=0; j--) {
				int temp = a[0];
				temps[a.length] = temp;
				
				temps[j] = a[j];
				a[j] = temps[j+1];
			}
		}
		
		
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		

	}

}
