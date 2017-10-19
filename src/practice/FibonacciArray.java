package practice;

import java.util.Arrays;

public class FibonacciArray {
	
	static int[] f = new int[11];
	
	public static int fib(int n) {
		
		if(n<=0)
			return 0;
		if(n==1 || n==2) {
			f[n] = 1;
			return 1;
		}
		else if(f[n]>-1)
			return f[n];
		else {
			f[n] = fib(n-2) + fib(n-1);
			return f[n];
		}
	}
	
	

	public static void main(String[] args) {
		
		Arrays.fill(f, -1);
		
		int a = 10;
		
		fib(a);
		for(int i=1; i<=a; i++)
			System.out.println(i+": "+f[i]);
		
		
	}

}
