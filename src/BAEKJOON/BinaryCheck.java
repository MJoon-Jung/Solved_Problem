package BAEKJOON;

import java.util.Scanner;
//BAEKJOON Problem 2193
public class BinaryCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] dp = new int [91];
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i <= dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		int n = sc.nextInt();
		System.out.println(dp[n]);
	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int [][] dp = new int [91][2];
//		dp[1][1] = 1;
//		for(int i = 2; i<= 90; i++) {
//			dp[i][0] = dp[i-1][0] + dp[i-1][1];
//			dp[i][1] = dp[i-1][0];
//		}
//		
//		int n = sc.nextInt();
//		int answer = 0;
//		
//		for(int i = 0; i<= 1; i++) {
//			answer += dp[n][i];
//		}
//		
//		
//		System.out.println(answer);
//	}
}
