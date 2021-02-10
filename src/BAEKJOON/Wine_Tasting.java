package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 2156
public class Wine_Tasting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		int [] dp = new int [n+1];
		
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		dp[1] = ar[0]; 
		if(n <= 1) {
			System.out.println(dp[n]);
			return;
		}
		dp[2] = dp[1]+ar[1];
		if(n <= 2) {
			System.out.println(dp[n]);
			return;
		}
		
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i-3] + ar[i-2] + ar[i-1];
			dp[i] = Math.max(dp[i], dp[i-2] + ar[i-1]);
			dp[i] = Math.max(dp[i], dp[i-1]);
		}
		System.out.println(dp[n]);
	}
}
