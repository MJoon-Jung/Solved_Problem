package BAEKJOON;

import java.util.Scanner;

public class Problem2225v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [][] dp = new int [201][201];
		int div = 1000000000;
		
		for(int i = 0; i < 201; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 2; i < 201; i++) {
			for(int j = 0; j < 201; j++) {
				dp[i][j] = dp[i-1][j];
				if(j-1 >= 0) {
					dp[i][j] += dp[i][j-1];
				}
				dp[i][j] %= div;
			}
		}
		
		System.out.println(dp[k][n]);
	}
}
