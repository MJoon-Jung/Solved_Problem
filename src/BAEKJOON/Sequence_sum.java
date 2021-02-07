package BAEKJOON;

import java.util.Scanner;
//BAEKJOON Problem 1912
public class Sequence_sum {
	static int [] ar;
	static int [] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ar = new int[n];
		dp = new int[n];
		
		for(int i = 0; i  < n; i++) {
			ar[i] = sc.nextInt();
		}
		dp[0] = ar[0]; 
		int answer = ar[0];
		
		for(int i = 1; i < n; i++) {
			dp[i] = ar[i];
			dp[i] = Math.max(dp[i], dp[i] + dp[i-1]);
			answer = Math.max(answer, dp[i]);
		}
//		int answer = Integer.MIN_VALUE;
//		for(int i = 0; i < n; i++) {
//			answer = Math.max(answer, dp[i]);
//		}
		
		System.out.println(answer);
	}
}
