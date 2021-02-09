package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 2225 Unresolved
public class AnalzeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long [][] dp = new long [201][201];
		int div = 1000000000;
		
		for(int i = 0; i < 201; i++) {
			dp[1][i] = 1;
			dp[i][0] = 1;
		}
		for(int i = 2; i < 201; i++) {
			for(int j = 0; j < 201; j++) {
				for(int l = 0; l <= j; l++) {
					dp[i][j] += dp[i-1][j-l] % div;
				}
			}
		}
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(dp[k][n]);
	}
}
