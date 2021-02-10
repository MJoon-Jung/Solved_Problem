package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 1932
public class Integer_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] ar = new int [500][500];
		int [][] dp = new int [500][500];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		dp[0][0] = ar[0][0];
		int answer = Integer.MIN_VALUE;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {				
				if(j == 0) {
					dp[i][j] += dp[i-1][j] + ar[i][j];
				}else {
					dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]) + ar[i][j];
				}
				answer  = Math.max(answer, dp[i][j]);
			}
		}
		System.out.println(answer);
	}
}
