package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 13398
public class Plus {
	public static void main(String[] args) {
		int answer = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] ar = new int [n+1];
		int [] dp = new int [100001];
		int [] dp2 = new int [100001];
		for(int i = 1; i <= n; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			dp[i] = ar[i];
			
			dp[i] = Math.max(dp[i], dp[i] + dp[i-1]);
			answer = Math.max(answer,dp[i]);
		}
		for(int i = 1; i <= n; i++) {
			dp[i] = ar[i];
			dp[i] = Math.max(dp[i], dp[i] + dp[i-1]);
			answer = Math.max(answer, dp[i]);
		}
		for(int i = n; i > 0; i--) {
			dp2[i] = ar[i];
			if(i == n) continue;
			dp2[i] = Math.max(dp2[i], dp2[i] + dp2[i+1]);
		}
		for(int i = 2; i < n; i++) {
			answer = Math.max(answer, dp[i-1] + dp2[i+1]);
		}
		
		System.out.println(answer);
		
	}
}
