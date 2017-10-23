package practice;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		
		
		String[] str = {"a", "b", "c", "d", "e"};

		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<str.length; i++)
			stack.push(str[i]);
		
		System.out.println(stack.pop());
		
	}

}
