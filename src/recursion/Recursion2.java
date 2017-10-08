package recursion;

public class Recursion2 {

	//문자열 출력하기
	static void printChars(String str) {
		
		if(str.length()==0)
			return;
		else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
	
	//문자열 역으로 출력하기
	static void printCharsReverse(String str) {
		
		if(str.length()==0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	//2진수 출력하기
	static void printBinary(int n) {
		
		if(n<2)
			System.out.print(n);
		else {
			printBinary(n/2);
			System.out.print(n%2);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/*==== 문자열 출력하기 =========================================================*/
		Recursion2.printChars("ACE");
		System.out.println("\n===================================");
		
		/*==== 문자열 역으로 출력하기 =========================================================*/
		Recursion2.printCharsReverse("ACE");
		System.out.println("\n===================================");
		
		/*==== 2진수 출력하기 =========================================================*/
		Recursion2.printBinary(10);
		System.out.println("\n===================================");
		
		
		
	}

}
