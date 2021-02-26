package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 11054
public class Bitonic_Sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		int [] lns = new int [n];
		int [] lds = new int [n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		int answer = 0;

		for(int i = 0; i < n; i++) {
			lns[i] = 1;
			for(int j = 0; j < i; j++) {
				if(ar[i] > ar[j] && lns[i] <= lns[j]) {
					lns[i] = lns[j] + 1;
				}
			}
		}
		
		for(int i = n-1; i >= 0; i--) {			
			lds[i] = 1;
			for(int j = i+1; j < n; j++) {
				if(ar[i] > ar[j] && lds[i] <= lds[j]) {
					lds[i] = lds[j] + 1;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			answer = Math.max(answer, lns[i] + lds[i]);
		}
		System.out.println(answer-1);
		
	}
}
