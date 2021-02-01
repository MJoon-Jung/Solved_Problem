package BAEKJOON;

import java.util.Scanner;
//BAEKJOON Problem 1003
public class Fibonachi_Zero_One {
	static Integer [][] dp = new Integer [41][2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		dp[0][0] = 1; dp[0][1] = 0;
		dp[1][0] = 0; dp[1][1] = 1;
		int n = sc.nextInt();
		
		for(int i =0; i < n; i++) {
			int s = sc.nextInt();
			fibonacci(s);
			sb.append(dp[s][0] + " " + dp[s][1] + "\n");
		}
		System.out.println(sb);
	}
	static Integer[] fibonacci(int N) {
		if(dp[N][0] == null || dp[N][1] == null) {
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		return dp[N];
	}
}
