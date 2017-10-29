package wooahan;

import java.util.Scanner;

public class Solution1 {
	static int[] members;
	static int[] temps;
	static int winner;
	
	public static void sige(int[] members, int k) {

		for(int i=0; i<k; i++) {
			for(int j=members.length-1; j>=0; j--) {
				int temp = members[0];
				temps[members.length] = temp;
				
				temps[j] = members[j];
				members[j] = temps[j+1];
			}
			if(members[0]==0) i--;
		}
		
		System.out.println(members[0]);
		winner = members[0];
		members[0] = 0;	//n번 탈락자
		
	}
	
	public static void bansige(int[] members, int k) {
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<members.length; j++) {
				int temp = members[members.length-1];
				
				temps[j+1] = members[j];
				members[j] = temps[j];
				
				members[0] = temp;
			}
			if(members[0]==0) i--;
		}
		
		System.out.println(members[0]);
		winner = members[0];
		members[0] = 0;	//n번 탈락자
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int d = s.nextInt();
			int k = s.nextInt();
			int j = s.nextInt();

			// 여기부터 작성해 주세요
			members = new int[n];
			temps = new int[n+1];
			
			
			for(int i=1; i<=members.length; i++)
				members[i-1] = i;
			
			if(d==1) {
				for(int i=0; i<n; i++) {
					sige(members, k);
					k = k+j;
				}
				System.out.println("당첨자: " + winner);
			}
			else if(d==0) {
				for(int i=0; i<n; i++) {
					bansige(members, k);
					k = k+j;
				}
				System.out.println("당첨자: " + winner);
			}
			
		}

	}

}
