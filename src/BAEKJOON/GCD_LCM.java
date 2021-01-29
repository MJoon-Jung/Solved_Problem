package BAEKJOON;

import java.util.Scanner;

public class GCD_LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sb.append(GCD(a,b) + "\n");
		sb.append(LCM(a,b) + "\n");
		System.out.println(sb);
	}
	public static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return GCD(b, a%b);
		}
	}
	public static int LCM(int a, int b) {
		int result = a * b / GCD(a,b);
		return result;
	}
}
