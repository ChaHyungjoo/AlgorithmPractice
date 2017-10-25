package practice;

import java.util.Scanner;

public class MinuteToSecond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int s = m*60;
		
		if(1<=m && m<=60)
			System.out.printf("%d minutes is %d seconds.", m, s);
		
		//System.out.println(Math.ceil(-3.8));
		//System.out.printf("%.3f", Math.sqrt(2));
		
		
	}

}
