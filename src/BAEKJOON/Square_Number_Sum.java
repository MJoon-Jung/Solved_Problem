package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 1699
public class Square_Number_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		int [] dp = new int [100001];
		for(int i = 1; i < dp.length; i++) { 
			dp[i] = i;
			for(int j = 1; j * j <= i; j++) {
				if(dp[i] > dp[i-j*j] + 1) {
					dp[i] = dp[i-j*j] + 1;
				}
			}
		}
		answer = dp[n];
		
		
		System.out.println(answer);
	}
}
