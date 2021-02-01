package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

//BAEKJOON Problem 9613
public class Sum_GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int k = 0; k < t; k++) {
			String s = sc.nextLine();
			String [] str = s.split(" ");
			int[] ar = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
			long sum = 0;
			for(int i = 1; i < ar.length -1; i++) {
				for(int j = i+1; j < ar.length; j++) {
					sum += GCD(ar[i],ar[j]);
				}
			}
			sb.append(sum+"\n");
		}
		System.out.println(sb);
	}
	static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return GCD(b,a%b);
		}
	}
}
