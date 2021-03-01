package BAEKJOON;

import java.util.Scanner;

public class Problem2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		int [][] dp = new int [n][2];
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				dp[i][0] = ar[i];
				continue;
			}
			if(i == 1) {
				dp[i][0] = dp[i][1] = ar[i];
				dp[i][1] += dp[i-1][0];
				continue;
			}
			dp[i][0] = dp[i][1] = ar[i];
			dp[i][0] += Math.max(dp[i-2][0], dp[i-2][1]);	
			dp[i][1] += dp[i-1][0];
		}
		answer = Math.max(dp[n-1][0], dp[n-1][1]);
		System.out.println(answer);
	}
}
