package BAEKJOON;

import java.util.Scanner;

public class Problem2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int r = sc.nextInt();
			String s = sc.next();
			
			for(int i = 0; i < s.length(); i++) {
				for(int j = 0; j < r; j++) {
					sb.append(s.charAt(i));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
