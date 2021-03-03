package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 2133
public class Fill_Tile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dp = new int [31];
		
		
		dp[0] = 1; dp[2] = 3;
		if(n <= 2) {
			System.out.println(dp[n]);
			return;
		}
		
		for(int i = 4; i <= 30; i+=2) {
			dp[i] = 2;
			dp[i] = dp[i] + dp[i-2] * 3;
			for(int j = 4; j < i; j+=2) {
				dp[i] = dp[i] + dp[i-j] * 2;
			}
		}
		
		System.out.println(dp[n]);
	}
}
