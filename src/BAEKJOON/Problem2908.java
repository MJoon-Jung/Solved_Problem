package BAEKJOON;

import java.util.Scanner;

public class Problem2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int va = Solution(a);
		int vb = Solution(b);
		
		System.out.println(Math.max(va, vb));
	}
	static int Solution(String n) {
		String answer = "";
		for(int i = 0; i < n.length(); i++) {
			answer = n.charAt(i) + answer;
		}
		return Integer.parseInt(answer);
	}
}
