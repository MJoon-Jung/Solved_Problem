package BAEKJOON;

import java.util.Scanner;

public class Problem1010v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			long answer = Solution(m,n);
			
			sb.append(answer + "\n");
		}
		System.out.println(sb);
	}
	static long Solution(int m, int n) {
		long answer = 1;
		int n_count = 1;
		int temp = 0;
		
		if(m-n >= n) temp = m-n;
		else if(n > m-n) temp = n;
		
		for(int i = temp+1; i <= m; i++) {
			answer *= i;
			answer /= n_count++;
		}
		
		return answer;
	}
}
