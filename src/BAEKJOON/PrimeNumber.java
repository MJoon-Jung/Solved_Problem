package BAEKJOON;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			if(isprime(k))cnt++;
		}
		System.out.println(cnt);
		
	}
	public static boolean isprime(int k) {
		if(k < 2) {
			return false;
		}
		for(int i = 2; i*i <= k; i++) {
			if(k % i == 0) {
				return false;
			}
		}
		return true;
	}
}
