package baekjoon;

import java.util.Scanner;

public class BinomialCoefficient {
	
	public static int bc(int n, int r) {
		
		if(n == r || r ==0)
			return 1;
		else
			return bc(n-1, r-1) + bc(n-1, r);
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		if((1<=n && n<=10) && (0<=r && r<=n))
			System.out.println(bc(n, r));
		
	}

}
