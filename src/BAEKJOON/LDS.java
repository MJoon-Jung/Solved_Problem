package BAEKJOON;

import java.util.Scanner;
//BAEKJOON Problem 11722
public class LDS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar=  new int [n];
		int [] dp = new int [n];
		
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int answer = 0;
		for(int i = 0; i < n; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(ar[i] < ar[j] && dp[i] <= dp[j]) {
					dp[i] = dp[j] + 1;
				}
			}
			answer = Math.max(answer, dp[i]);
		}
		System.out.println(answer);
	}
}
