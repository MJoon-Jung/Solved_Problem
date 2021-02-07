package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 11053
public class LIS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] ar = new int [N];
		for(int i = 0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		
		int [] dp = new int [N];
		
		for(int i = 0; i < N; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(dp[i] < dp[j]+1 && ar[j] < ar[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		int answer = 0;
		for(int i = 0; i < N; i++) {
			answer = Math.max(dp[i], answer);
		}
		System.out.println(answer);
	}
}
