package BAEKJOON;

import java.util.Scanner;

public class Problem2225v1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] dp = new int [201][201];
		int div = 1000000000;
		
		for(int i = 0; i < 201; i++) {
			dp[1][i] = 1;
		}
		for(int i = 2; i < 201; i++) {
			for(int j = 0; j < 201; j++) {
				for(int l = 0; l <= j; l++) {
					dp[i][j] += dp[i-1][j-l];
					dp[i][j] %= div;
				}
			}
		}
		System.out.println(dp[k][n]);
		
	}
}
