package practice;

import java.util.Scanner;

//memoization(�߰������ �迭�� �����Ͽ� �ݺ���꿡 ����ϴ� ��)�� �̿��� ���װ�� ���ϱ�
public class BinomialCoefficient {
	
	static int[][] dp;
	
	//������ȹ������ ����
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
	
	// nCr ���� ��ȯ�ϴ� �޼���
	public static int combination(int n, int r) {
		
		//n�� �� r�� ���� �� n=r �̰ų� r=0�� ���� 1 �ۿ� ����
		if (n == r || r == 0) {
			dp[n][r] = 1;			
			return dp[n][r];
		}
		if (dp[n][r] > 0)	//0���� ũ�ٴ°� �ش� �迭�� ���� �ִٴ� ���̹Ƿ� �迭�� ���� ����
			return dp[n][r];
		//nCr�� n-1Cr-1 
		dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
		return dp[n][r];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		dp = new int[31][31];

		int n = sc.nextInt();
		int r = sc.nextInt();
		//System.out.println(combination(n, r));
		
		//������ȹ�� ���
		dp[1][0] = dp[1][1] = 1;
		System.out.println(combinationDp(n, r));
		
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++)
				System.out.print(dp[i][j]+" ");
			System.out.println("");
		}
		

	}

	
		
}
