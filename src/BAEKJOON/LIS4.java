package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

//BAEKJOON Problem 14002
public class LIS4 {
	static StringBuilder sb;
	static int [] ar;
	static int [] dp;
	static int [] dx;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Stack<Integer>stack = new Stack<>();
		sb = new StringBuilder();
		int n = sc.nextInt();
		ar = new int [n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		dp = new int [n];
		dx = new int [n];
		
		for(int i = 0; i < n; i++) {
			dp[i] = 1; dx[i] = -1;
			for(int j = 0; j < i; j++) {
				if(dp[i] < dp[j] + 1 && ar[j] < ar[i]) {
					dp[i] = dp[j] + 1;
					dx[i] = j;
				}
			}
		}
		int a = -1;
		int b = -1;
		for(int i = 0; i < n; i++) {
			if(a < dp[i]) {
				a = dp[i];
				b = i;
			}
		}
		sb.append(a + "\n");
		Solution(b);
//		while(b != -1) {
//			stack.add(ar[b]);
//			b = dx[b];
//		}
//		while(!stack.empty()) {
//			sb.append(stack.pop() + " ");
//		}
		System.out.println(sb);
	}
	public static void Solution(int k) {
		if(k == -1) {
			return;
		}
		Solution(dx[k]);
		
		sb.append(ar[k] + " ");
	}
	
}
