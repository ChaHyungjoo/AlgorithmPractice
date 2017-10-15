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
	
	//순차탐색1 (앞에서부터 탐색)
	static int search(int data[], int begin, int end, int target) {
		
		if(begin>end)
			return -1;
		else if(data[begin]==target)
			return begin;
		else
			return search(data, begin+1, end, target);
	}
	
	//순차탐색2 (뒤에서부터 탐색)
	static int search2(int data[], int begin, int end, int target) {
		
		if(begin>end)
			return -1;
		else if(data[end]==target)
			return end;
		else
			return search(data, begin, end-1, target);
	}
	
	//순차탐색3 (반으로 나누어서 탐색)
	static int search3(int data[], int begin, int end, int target) {
		
		if(begin>end)
			return -1;
		else{
			int middle = (begin + end)/2;
			
			if(data[middle]==target)
				return middle;
			int index = search(data, begin, middle-1, target);
			if(index != -1)
				return index;
			else
				return search(data, begin, middle+1, target);
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
