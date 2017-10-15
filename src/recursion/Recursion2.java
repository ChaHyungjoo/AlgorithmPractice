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
	
	//����Ž��1 (�տ������� Ž��)
	static int search(int data[], int begin, int end, int target) {
		
		if(begin>end)
			return -1;
		else if(data[begin]==target)
			return begin;
		else
			return search(data, begin+1, end, target);
	}
	
	//����Ž��2 (�ڿ������� Ž��)
	static int search2(int data[], int begin, int end, int target) {
		
		if(begin>end)
			return -1;
		else if(data[end]==target)
			return end;
		else
			return search(data, begin, end-1, target);
	}
	
	//����Ž��3 (������ ����� Ž��)
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
