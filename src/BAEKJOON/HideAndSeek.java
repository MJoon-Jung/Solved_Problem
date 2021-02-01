package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 17087
public class HideAndSeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int [] c_pos = new int [n];
		for(int i = 0; i < n; i++) {
			c_pos[i] = Math.abs(sc.nextInt() - x);
		}
		int gcd = c_pos[0];
		
		if(n!=1) {			
			for(int i =1; i < n; i++) {
				gcd = GCD(gcd,c_pos[i]);
			}
		}
		sb.append(gcd);
		System.out.println(sb);
				
	}
	public static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return GCD(b, a%b);
		}
	}
}
