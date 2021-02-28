package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 17404
public class RGB2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = Integer.MAX_VALUE;
		int [][] ar = new int [n+1][3];
		int [][] dp = new int [n+1][3];
		for(int i = 1; i <= n; i++) {
			for(int j = 0 ; j < 3; j++) {
				ar[i][j] = sc.nextInt();
			}
		}	
		
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i < 3; i++) {
				if(k == i) {
					dp[1][i] = ar[1][i];
				}
				else {
					dp[1][i] = 1001 * 100000;
				}
			}
			
			for(int i = 2; i <= n; i++) {
				dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + ar[i][0];
				dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + ar[i][1];
				dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + ar[i][2];
			}
			
			for(int i = 0; i < 3; i++) {
				if(i == k) {
					continue;
				}
				answer = Math.min(answer, dp[n][i]);
			}
			
		}
		System.out.println(answer);
	}
}
