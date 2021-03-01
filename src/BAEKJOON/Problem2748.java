package BAEKJOON;

import java.util.Scanner;

public class Problem2748 {
	static long [] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new long [91];
		
		System.out.println(fibonacci(n));
	}
	static long fibonacci(int n) {
		if(n == 0) {
			dp[n] = 0;
			return 0;
		}
		if(n == 1) {
			dp[n] = 1;
			return 1;
		}
		if(dp[n] > 0) return dp[n];
		
		dp[n] = dp[n-1] + dp[n-2];
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
