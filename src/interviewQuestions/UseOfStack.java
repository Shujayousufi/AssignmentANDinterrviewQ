package interviewQuestions;

import java.util.HashSet;
import java.util.Stack;

public class UseOfStack {
	
	public static void main(String[] args) {
		String str = "((())((()))((())))";
		System.out.println(isBalanced(str)); 
	
	}
	public static boolean isBalanced( String str) {
		Stack<Character> chars = new Stack<Character>();
		for (Character c : str.toCharArray()) {
			if(c == '(' ) {
				chars.add(c);
			}
			else if(c == ')' && chars.pop() != '(') {	
				
			}
		}
		return chars.size() == 0;
	}
}
