package BAEKJOON;

import java.util.Scanner;

public class Problem10809 {
	public static void main(String[] args) {
		char Alpa = 97;	
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String s = sc.next();
		
		for(int i = 0; i < 26; i++) {
			sb.append(Solution(s,Alpa++) + " ");
		}
		System.out.println(sb);
	}
	static int Solution(String s, char c) {
		for(int i = 0; i < s.length(); i++) {
			char t = s.charAt(i);
			if(t == c) {
				return i;
			}
		}
		return -1;
	}
}
