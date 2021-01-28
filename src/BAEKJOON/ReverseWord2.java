package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

//BAEKJOON Problem 17413
public class ReverseWord2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character>stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		String str = sc.nextLine();
		boolean start = false;
		
		for(int i = 0; i <str.length(); i++) {
			char s = str.charAt(i);
			if(s == '<') {
				while(!stack.empty()) {
					sb.append(stack.pop());
				}
				sb.append(s);
				start = true;
			}else if(s == '>') {
				sb.append(s);
				start = false;
			}else if(start) {
				sb.append(s);
			}else {
				if(s == ' ') {
					while(!stack.empty()) {
						sb.append(stack.pop());
					}
					sb.append(s);
				}else {
					stack.push(s);
				}
			}
		}
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	
	}
}
