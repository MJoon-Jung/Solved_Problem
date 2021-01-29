package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 1929
public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int [] prime = new int [end];
		int pn = 0;
		boolean [] check = new boolean [prime.length + 1];
		
		for(int i = 2; i <= end; i++) {
			if(!check[i]) {
				prime[pn++] = i;
				for(int j = i + i; j <= end; j += i) {
					check[j] = true;
				}
			}
		}
		
		
		
//		for(int i = 2; i <= end; i++) {
//			if(check[i] == false) {
//				prime[pn++] = i;
//				for(int j = i+i; j <=end; j+= i) {
//					check[j] = true;
//				}
//			}
//		}
//		
		for(int i = 0; i < pn; i++) {
			if(prime[i] >= start) {
				sb.append(prime[i] + "\n");
			}
		}
		System.out.println(sb);
	}
}
