package baekjoon;

import java.util.Scanner;

public class BinomialCoefficient2 {
	
	static int[][] a;
	
	public static int bc(int n, int r) {
		
		for(int i=0; i<=n; i++)
			for(int j=0; (j<=r && j<=i); j++) {
				
				if(i == j || j == 0) {
					a[i][j] = 1%10007;
				}
				/*else if(a[i][j]>0)
					return a[i][j];*/
				else {
					a[i][j] = (a[i-1][j-1] + a[i-1][j])%10007;
				}
				
			}
		
		return a[n][r];
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		a = new int[n+1][n+1];
		
		System.out.println(bc(n,r));
		

	}

}
