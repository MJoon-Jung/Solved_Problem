package BAEKJOON;

import java.util.Scanner;

public class Plus_One_Two_Three3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int div = 1000000009;
		int t = sc.nextInt();
		long [] dp = new long [1000001];
		
		dp[0] = 1; dp[1] = 1; dp[2] = 2;
		
		for(int i = 3; i < dp.length; i++) {
			dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%div;
		}
		
		while(t-- > 0) {
			int n = sc.nextInt();
			sb.append(dp[n]+"\n");
		}
		System.out.println(sb);
	}
}
