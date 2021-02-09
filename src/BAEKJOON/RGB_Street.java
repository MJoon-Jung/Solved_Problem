package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 1149
public class RGB_Street {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n= sc.nextInt();
		int [][] rgb = new int [n][3];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				rgb[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1; i < n; i++) {
			rgb[i][0] += Math.min(rgb[i-1][1], rgb[i-1][2]);
			rgb[i][1] += Math.min(rgb[i-1][0], rgb[i-1][2]);
			rgb[i][2] += Math.min(rgb[i-1][0], rgb[i-1][1]);
		}
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			answer  = Math.min(rgb[n-1][i], answer);
		}
		System.out.println(answer);
	}
}
