package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 16194
public class BuyCard2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dt = new int [n+1];
		int [] dp = new int [n+1];
		
		for(int i = 1; i <= n; i++) {
			dt[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if(dp[i] == 0) {
					dp[i] = dp[i-j] + dt[j];
				}
				dp[i] = Math.min(dp[i-j] + dt[j],dp[i]);
			}
		}
		System.out.println(dp[n]);
	}
}
