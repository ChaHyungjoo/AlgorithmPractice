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
	
	//0~n������ ���� ����ϴ� �Լ�
	static int sum(int n) {
		
		if(n==0)
			return 0;
		else{
			return n + sum(n-1);
		}
		
	}
	
	//0~n������ ��(factorial)�� ����ϴ� �Լ�
	static int factorial(int n) {
		
		if(n==0)
			return 1;	//0! = 1�̹Ƿ� 1�� ��ȯ
		else
			return n * factorial(n-1);
		
	}

	//x�� n������ ����ϴ� �Լ�
	static int power(int x, int n) {
		
		if(n==0)
			return 1;
		else
			return x * power(x, n-1);
		
	}
	
	//�Ǻ���ġ ����
	static int fibonacci(int n) {
		//n3 = n1 + n2 �� ����
		
		if(n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
	}
	
	//�ִ����� ���ϱ�(��Ŭ���� ȣ����)
	static int gcd(int m, int n) {
		/*System.out.println(m);
		System.out.println(n);
		System.out.println("************");*/
		
		if(n==0)	//0�� ����� ���ص� 0�̹Ƿ� ��ǻ� 0�� ����� ��� �ڿ����̴�
			return m;
		else
			return gcd(n, m%n);
		
	}
	
	
	public static void main(String[] args) {
		
		/*==== ��ȯ ����1 =========================================================*/
		Recursion1.recursion(4);
		System.out.println("=============================");
		
		/*==== ��ȯ�ϸ� �����ϱ� =========================================================*/
		int result = Recursion1.sum(4);
		System.out.println(result);
		System.out.println("=============================");
		
		/*==== ��ȯ�ϸ� �����ϱ�(factorial) =========================================================*/
		int result2 = Recursion1.factorial(4);
		System.out.println(result2);
		System.out.println("=============================");
		
		/*==== ��ȯ�ϸ� �����ϱ�2(x�� n���� ���ϱ�) =========================================================*/
		int result3 = Recursion1.power(2, 4);
		System.out.println(result3);
		System.out.println("=============================");
		
		/*==== �Ǻ���ġ ���� =========================================================*/
		int result4 = Recursion1.fibonacci(5);
		System.out.println(result4);
		System.out.println("=============================");
		
		/*==== �ִ����� ���ϱ�(��Ŭ���� ȣ����) =========================================================*/
		int result5 = Recursion1.gcd(12, 9);
		System.out.println(result5);
		System.out.println("=============================");
		
		
		
		
		
		
	}

}
