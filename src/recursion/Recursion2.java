package recursion;

public class Recursion2 {

	//���ڿ� ����ϱ�
	static void printChars(String str) {
		
		if(str.length()==0)
			return;
		else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
	
	//���ڿ� ������ ����ϱ�
	static void printCharsReverse(String str) {
		
		if(str.length()==0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	//2���� ����ϱ�
	static void printBinary(int n) {
		
		if(n<2)
			System.out.print(n);
		else {
			printBinary(n/2);
			System.out.print(n%2);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/*==== ���ڿ� ����ϱ� =========================================================*/
		Recursion2.printChars("ACE");
		System.out.println("\n===================================");
		
		/*==== ���ڿ� ������ ����ϱ� =========================================================*/
		Recursion2.printCharsReverse("ACE");
		System.out.println("\n===================================");
		
		/*==== 2���� ����ϱ� =========================================================*/
		Recursion2.printBinary(10);
		System.out.println("\n===================================");
		
		
		
	}

}
