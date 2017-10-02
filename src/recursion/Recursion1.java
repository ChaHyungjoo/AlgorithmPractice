package recursion;

public class Recursion1 {
	
	static void recursion(int n) {
		
		if(n==0)
			return;
		else{
			System.out.println("hello recursion");
			recursion(n-1);
		}
		
	}
	
	//0~n까지의 합을 계산하는 함수
	static int sum(int n) {
		
		if(n==0)
			return 0;
		else{
			return n + sum(n-1);
		}
		
	}
	
	//0~n까지의 곱(factorial)을 계산하는 함수
	static int factorial(int n) {
		
		if(n==0)
			return 1;	//0! = 1이므로 1을 반환
		else
			return n * factorial(n-1);
		
	}

	//x의 n제곱을 계산하는 함수
	static int power(int x, int n) {
		
		if(n==0)
			return 1;
		else
			return x * power(x, n-1);
		
	}
	
	//피보나치 수열
	static int fibonacci(int n) {
		//n3 = n1 + n2 인 수열
		
		if(n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		/*==== 순환 예제1 =========================================================*/
		Recursion1.recursion(4);
		System.out.println("=============================");
		
		/*==== 순환하며 덧셈하기 =========================================================*/
		int result = Recursion1.sum(4);
		System.out.println(result);
		System.out.println("=============================");
		
		/*==== 순환하며 곱셈하기(factorial) =========================================================*/
		int result2 = Recursion1.factorial(4);
		System.out.println(result2);
		System.out.println("=============================");
		
		/*==== 순환하며 곱셈하기2(x의 n제곱 구하기) =========================================================*/
		int result3 = Recursion1.power(2, 4);
		System.out.println(result3);
		System.out.println("=============================");
		
		/*==== 피보나치 수열 =========================================================*/
		int result4 = Recursion1.fibonacci(5);
		System.out.println(result4);
		System.out.println("=============================");
		
	}

}
