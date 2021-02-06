package BAEKJOON;

import java.util.Scanner;

//BEAKJOON Problem 11052
public class BuyCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dt = new int [n+1];
		int [] dp = new int [n+1];
		for(int i = 1; i <= n; i++) {
			dt[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i ; j++) {
				dp[i] = Math.max(dp[i], dp[i-j] + dt[j]);
			}
		}
		System.out.println(dp[dp.length-1]);
	}
}
