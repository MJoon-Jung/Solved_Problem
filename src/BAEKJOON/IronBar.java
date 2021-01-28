package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//BAEKJOON Problem 10799
public class IronBar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer>stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		String str = sc.next();
		char [] ar = str.toCharArray();
		int cnt = 0;
		
		stack.push(0);
		for(int i = 1; i < ar.length; i++) {
			if(ar[i] == ')') {
				if(i == stack.peek() + 1) {
					cnt += stack.size() -1;
					stack.pop();
				}else {
					stack.pop();
					cnt++;
				}
			}else {
				stack.push(i);
			}
		}
		System.out.println(cnt);
		
	}
}
