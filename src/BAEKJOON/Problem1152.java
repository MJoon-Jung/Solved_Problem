package BAEKJOON;

import java.util.Scanner;

public class Problem1152 {
	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
				
		boolean isAlpa = false;
		for(int i = 0; i < s.length(); i++) {
			char c = Character.toUpperCase(s.charAt(i));
			if(c >= 65 && c <= 90 && !isAlpa) {
				answer++;
				isAlpa = true;
				continue;
			}
			if(c == ' ' && isAlpa) {
				isAlpa = false;
				continue;
			}
		}
		System.out.println(answer);
	}
}
