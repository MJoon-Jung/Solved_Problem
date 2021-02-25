package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 2839
public class Move_Sugar {
	static int [] dp = new int [1001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dp = new int [5001];
		
		for(int i = 3; i < dp.length; i++) {
			int a,b;
			
			a = i / 5;
			b = i % 5;
			
			if(b == 0) {
				dp[i] = a;
			}
			else if(b == 1) {
				dp[i] = a + 1;
			}
			else if(b == 2) {
				if(a >= 2) {					
					dp[i] = a + 2;
				}else {
					dp[i] = -1;
				}
			}
			else if(b == 3) {
				dp[i] = a + 1;
			}
			else if(b == 4) {
				if(a >= 1) {					
					dp[i] = a + 2;
				}else {
					dp[i] = -1;
				}
			}
		}
		
		System.out.println(dp[n]);

	}
}
