package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 17103
public class Goldbach_Conjecture_partition {
	public static void main(String[] args) {
		//create isprime board
		int board = 1000000;
		int [] prime = new int [board];
		int idx = 0;
		boolean [] check = new boolean [board+1];
		for(int i = 2; i <= board; i++) {
			if(!check[i]) {
				prime[idx++] = i;
				for(int j = i+i; j <= board; j+=i) {
					check[j] = true;
				}
			}
		}
		
		//solve problem
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int cnt = 0;
			for(int j = 0; prime[j] <= n/2; j++) {
				if(!check[n-prime[j]]) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
