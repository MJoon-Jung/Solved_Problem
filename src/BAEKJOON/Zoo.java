package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 1309
public class Zoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int div = 9901;
		int [][] dp = new int [100001][3];
		
		dp[1][0] = dp[1][1] = dp[1][2] = 1;
		
		for(int i = 2; i < dp.length; i++) {
			dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%div;
			dp[i][1] = (dp[i-1][0] + dp[i-1][2])%div;
			dp[i][2] = (dp[i-1][0] + dp[i-1][1])%div;
		}
		
		int n = sc.nextInt();
		int answer = (dp[n][0] + dp[n][1]+ dp[n][2])%div;
		System.out.println(answer);
	}
}
