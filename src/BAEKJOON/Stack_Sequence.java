package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// Problem 1874
public class Stack_Sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer>stack = new Stack<>();
	
		
		int cnt = sc.nextInt();
		int m = 0;
		
		for(int i = 0; i < cnt; i++) {
			int x = sc.nextInt();
			if(x > m) {
				while(x > m) {
					stack.push(++m);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}else {
				if(stack.peek() == x) {
					stack.pop();
					sb.append("-\n");
				}else {
					sb.setLength(0);
					sb.append("NO");
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
