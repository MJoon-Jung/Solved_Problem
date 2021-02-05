package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 11726
public class two_N_tile {
	static long [] ar;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ar = new long [n+1];
		System.out.println(count(n));
	}
	public static long count(int n) {
		if(ar[n] > 0) {
			return ar[n];
		}
		if(n >= 0 && n <= 2) {
			ar[n] = n;
			return ar[n];
		}
		ar[n] = count(n-1) + count(n-2);
		ar[n] %= 10007;
		return ar[n];
	}
}
