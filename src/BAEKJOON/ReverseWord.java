package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				char s = str.charAt(j);
				if(s == ' ') {
					while(!stack.empty()) {
						sb.append(stack.pop());
					}
					sb.append(String.valueOf(s));
				}else {
					stack.push(String.valueOf(s));
				}
			}
			while(!stack.empty()) {
				sb.append(stack.pop());
			}
			sb.append("\n");
			
		}
		System.out.println(sb);
		
	}

}
