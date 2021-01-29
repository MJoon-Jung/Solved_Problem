package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 6588
public class Goldbach_Conjecture {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int end = 1000000;
		
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
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0)
				break;
			for(int i = 0; i < pn; i++) {
				if(!check[n-prime[i]]) {
					sb.append(n+" = "+prime[i]+" + "+ (n-prime[i])+"\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
