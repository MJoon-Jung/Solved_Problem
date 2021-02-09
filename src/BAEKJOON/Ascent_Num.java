package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 11057
public class Ascent_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 10007;
		int [][] dp = new int [1001][10];
		long answer = 0;
		for(int i = 0; i <= 9; i++) {
			dp[1][i] = 1;
		}
		for(int i = 2; i < dp.length; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = 0; k <= j; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= div;
				}
			}
		}
		for(int i = 0; i <= 9; i++) {
			answer += dp[n][i];
			answer %= div;
		}
		System.out.println(answer);
	}
}
