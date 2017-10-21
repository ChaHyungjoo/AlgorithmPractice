package practice;

public class fefw {
	
	static String[][] map = new String[5][5];
	
	public static void recursion(String str, int i, int j) {
		
		if(str.length()==0)
			return;
		else {
			if(str.charAt(0)=='1')
				map[i][j] = "#";
			else
				map[i][j] = " ";
			recursion(str.substring(1), i, j);
		}
	}

	public static void main(String[] args) {
		
		int[] a = {9, 20, 28, 18, 11};
		int[] b = {30, 1, 21, 17, 28};
		int[] c = new int[5];
		
		
		
		for(int i=0; i<5; i++) {
			c[i] = a[i]|b[i];
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<5; i++)
			System.out.print(Integer.toBinaryString(c[i])+ " ");
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				//System.out.print(Integer.toBinaryString(c[i]).charAt(j)+" ");
				if(Integer.toBinaryString(c[i]).charAt(j)=='1')
					map[i][j] = "#";
				else
					map[i][j] = " ";
			}
			
			//System.out.println();
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				System.out.print(map[i][j]+ " ");
				
			System.out.println();
		}
	}

}
