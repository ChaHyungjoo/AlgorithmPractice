package practice;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		
		/*long a = (long) Math.sqrt(s);
		long b = (long) Math.pow(2, 63);
		System.out.println(a);
		System.out.println(b);*/
		
		if(0<=s && s<=Math.pow(2, 63)) {
			long n = (long) Math.ceil(Math.sqrt(s));
			System.out.printf("%d", n);
		}
		
	}

}
