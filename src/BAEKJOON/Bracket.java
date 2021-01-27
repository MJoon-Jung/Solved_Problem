package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

//problem 9012
public class Bracket {

	static String valid(String s) {
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				cnt++;
			}else {
				cnt--;
			}
			if(cnt < 0) {
				return "NO";
			}
		}
		if(cnt == 0) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String s = sc.nextLine();
			System.out.println(valid(s));
		}
	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		Stack<String> stack = new Stack<>();		
//		int n = sc.nextInt();
//		sc.nextLine();
//		for(int i = 0; i < n; i++) {
//			String str = sc.nextLine();
//			
//			for(int j = 0; j < str.length(); j++) {
//				char s = str.charAt(j);
//				if(s =='(') {
//					stack.push(String.valueOf(s));
//				}else if(s == ')') {
//					if(stack.empty()) {
//						System.out.println("NO");
//						break;
//					}else {
//						stack.pop();
//					}
//				}
//				if(j == str.length()-1) {
//					if(!stack.empty()) {
//						System.out.println("NO");
//					}else {
//						System.out.println("YES");
//					}
//				}
//			}
//			stack.clear();
//		} 
//	}

}
