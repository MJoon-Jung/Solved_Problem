package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 2004
public class Combination_Zero_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//NcM   n! / (m! * (n-m)!  2 * 5 = 10      Zero_count > 2 * 5
		
		long n = sc.nextInt();
		long m = sc.nextInt();
		
		long two = tfCount(n) - tfCount(m) - tfCount(n-m);
		long five = nmCount(n) - nmCount(m) - nmCount(n-m);
		
		System.out.println(Math.min(two, five));
		
	}
	static long tfCount(long n) {
		long cnt = 0;
		for(int i = 2; i <= n; i*=2) {
			cnt+=n/i;
		}
		return cnt;
	}
	static long nmCount(long n) {
		long cnt = 0;
		for(int i = 5; i <= n; i*=5) {
			cnt+=n/i;
		}
		return cnt;
	}
}
