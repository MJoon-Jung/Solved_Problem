package BAEKJOON;

import java.util.Scanner;

public class Problem9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		long [] dp = new long [101];
		dp[1] = dp[2] = 1;
		
		for(int i = 3; i <= 100; i++) {
			dp[i] = dp[i-2] + dp[i-3];
		}
		while(t-- > 0) {
			int n = sc.nextInt();
			sb.append(dp[n] + "\n");
		}
		System.out.println(sb);
	}
}
