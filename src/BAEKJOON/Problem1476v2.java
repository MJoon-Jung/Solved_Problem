package BAEKJOON;

import java.util.Scanner;

public class Problem1476v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		e--; s--; m--;
		for(int i = 0; ; i++) {
			if(i % 15 == e && i % 28 == s && i % 19 == m) {
				System.out.println(++i);
				return;
			}
		}
	}
}
