package BAEKJOON;

import java.util.Scanner;
//BAEKJOON Problem 11727
public class two_N_tile2 {
	static int [] ar;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ar = new int [n+1];
		
		System.out.println(count(n));
	}
	public static int count(int n) {
		if(n == 0 || n == 1) {
			ar[n] = n;
			return ar[n];
		}
		if(ar[n] > 0) {
			return ar[n];
		}
		if(n == 2) {
			ar[n] = 3;
			return ar[n];
		}
		ar[n] = count(n-1) + count(n-2) * 2;
		ar[n] %= 10007;
		return ar[n];
		
	}
}
