package BAEKJOON;

import java.util.Scanner;

public class LIS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		int [] dp = new int [n];
		
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		int answer = -1;
		dp[0] = ar[0];
		for(int i = 0; i < n; i++) {
			dp[i] = ar[i];
			for(int j = i-1; j >= 0; j--) {
				if(ar[i] > ar[j]) {
					dp[i] = Math.max(dp[i], ar[i] + dp[j]);
				}
			}
			answer = Math.max(answer, dp[i]);
		}
		
		System.out.println(answer);
	}
}
