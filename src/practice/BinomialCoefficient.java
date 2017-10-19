package practice;

import java.util.Scanner;

public class BinomialCoefficient {
	
	static int[][] dp;
	
	// nCr 값을 반환하는 메서드
	public static int combination(int n, int r) {
		if (n == r || r == 0)
			return 1;
		if (dp[n][r] > 0)
			return dp[n][r];

		dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
		return dp[n][r];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		dp = new int[31][31];

		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(combination(n, r));
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++)
				System.out.print(dp[i][j]+"  ");
			System.out.println("");
		}
		

	}

	
		
}
