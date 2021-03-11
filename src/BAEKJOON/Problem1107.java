package BAEKJOON;

import java.util.Scanner;

public class Problem1107 {
	static boolean [] isTrue;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		isTrue = new boolean [10];
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			isTrue[x] = true;
		}
		
		int answer = Math.abs(n - 100);
		
		for(int i = 0; i <=  1000000; i++) {
			int length = isPossible(i);
			if(length > 0) answer = Math.min(answer, Math.abs(n - i) + length);
		}
		
		System.out.println(answer);
		
	}
	public static int isPossible(int n) {
		if(n == 0){
			if(isTrue[n]) return 0;
			else return 1;
		}
		int len = 0;
		
		while(n > 0){
			if(isTrue[n % 10]) return 0;
			len++;
			n /= 10;
		}
		return len;
	}
}
