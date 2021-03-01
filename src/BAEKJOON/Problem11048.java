package BAEKJOON;

import java.util.Scanner;

public class Problem11048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt();
		int [][] dp = new int [1001][1001];
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				dp[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				dp[i][j] += maxDP(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]);
			}
		}
		System.out.println(dp[n][m]);
	}
	static int maxDP(int a,int b,int c) {
		int temp = Math.max(a, b);
		int answer = Math.max(temp, c);
		return answer;
	}
}
