package practice;

import java.util.Scanner;

//memoization(중간결과를 배열에 저장하여 반복계산에 사용하는 것)을 이용한 이항계수 구하기
public class BinomialCoefficient {
	
	static int[][] dp;
	
	//동적계획법으로 구현
	public static int combinationDp(int n, int r) {
		
		for(int i=2; i<=n; i++)
			for(int j=0; j<=r && j<=i; j++) {
				if(i == j || j ==0) {
					dp[i][j] = 1;
				}else {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				}
				
			}
		
		return dp[n][r];
		
		
	}
	
	// nCr 값을 반환하는 메서드
	public static int combination(int n, int r) {
		
		//n개 중 r을 뽑을 때 n=r 이거나 r=0인 경우는 1 밖에 없다
		if (n == r || r == 0) {
			dp[n][r] = 1;			
			return dp[n][r];
		}
		if (dp[n][r] > 0)	//0보다 크다는건 해당 배열에 값이 있다는 뜻이므로 배열의 값을 리턴
			return dp[n][r];
		//nCr은 n-1Cr-1 
		dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
		return dp[n][r];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		dp = new int[31][31];

		int n = sc.nextInt();
		int r = sc.nextInt();
		//System.out.println(combination(n, r));
		
		//동적계획법 사용
		dp[1][0] = dp[1][1] = 1;
		System.out.println(combinationDp(n, r));
		
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++)
				System.out.print(dp[i][j]+" ");
			System.out.println("");
		}
		

	}

	
		
}
