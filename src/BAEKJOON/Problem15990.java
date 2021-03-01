package BAEKJOON;

import java.util.Scanner;

public class Problem15990 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		
		long [][] dp = new long [100001][4];
		int div = 1000000009;
		
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
		for(int i = 4; i < dp.length; i++) {
			dp[i][1] = (dp[i-1][2] + dp[i-1][3])%div;
			dp[i][2] = (dp[i-2][1] + dp[i-2][3])%div;
			dp[i][3] = (dp[i-3][1] + dp[i-3][2])%div;
		}

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			long answer = (dp[n][1] +dp[n][2]+dp[n][3])%div;
			sb.append(answer + "\n");
		}
		System.out.println(sb);
	}
}
